package com.defold.apkverifier;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import android.content.Context;

public class apkverifier {
    public static boolean isInstalledFromMarket(Context context) {
        List<String> validInstallers = new ArrayList<String>(Arrays.asList("com.android.vending", "com.google.android.feedback"));
        final String installer = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installer != null && validInstallers.contains(installer);
    }

    public static String getPackageName(Context context) {
        return context.getPackageName();
    }
}
