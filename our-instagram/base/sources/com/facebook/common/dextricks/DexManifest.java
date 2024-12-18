package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0eW;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class DexManifest {
    public static final String DEX_EXT = ".dex";
    public static final String ODEX_EXT = ".odex";
    public final Dex[] dexes;
    public final String id;
    public final boolean isArtMainStore;
    public final boolean locators;
    public final String[] requires;
    public final boolean rootRelative;
    public final C0eW superpackExtension;
    public final int superpackFiles;

    /* loaded from: classes.dex */
    public final class Dex {
        public final String assetName;
        public final String canaryClass;
        public final String hash;

        public String makeDexName() {
            return DexManifest.makeCompileUnitNameFromHashAndExtension(this.hash, DexManifest.DEX_EXT);
        }

        public String makeOdexName() {
            return DexManifest.makeCompileUnitNameFromHashAndExtension(this.hash, DexManifest.ODEX_EXT);
        }

        public String toString() {
            return String.format("<Dex assetName:[%s]>", this.assetName);
        }

        public Dex(String str, String str2, String str3) {
            this.assetName = str;
            this.hash = str2;
            this.canaryClass = str3;
        }
    }

    public static String makeCompileUnitNameFromHashAndExtension(String str, String str2) {
        if (!str2.startsWith(".")) {
            str2 = AnonymousClass001.A0R(".", str2);
        }
        return AnonymousClass001.A0g("prog-", str, str2);
    }

    public static String makeDexNameFromHash(String str) {
        return makeCompileUnitNameFromHashAndExtension(str, DEX_EXT);
    }

    public static String makeOdexNameFromHash(String str) {
        return makeCompileUnitNameFromHashAndExtension(str, ODEX_EXT);
    }

    public boolean canLoadCanaryClass() {
        if (this.isArtMainStore) {
            Mlog.w("Art main store, not checking canary class", new Object[0]);
            return true;
        }
        Dex[] dexArr = this.dexes;
        if (dexArr.length == 0) {
            return false;
        }
        String str = dexArr[0].canaryClass;
        try {
            Mlog.safeFmt("attempting to detect built-in ART multidex by classloading %s", str);
            Class.forName(this.dexes[0].canaryClass);
            Mlog.safeFmt("ART native multi-dex in use: found %s", str);
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            Mlog.safeFmt("ART multi-dex not in use: cannot load %s", str);
            return false;
        }
    }

    public boolean isArtMainStore() {
        return this.isArtMainStore;
    }

    public void verifyCanaryClasses() {
        int i = 0;
        if (this.isArtMainStore) {
            Mlog.w("Art main store, not verifying canary class", new Object[0]);
            return;
        }
        while (true) {
            Dex[] dexArr = this.dexes;
            if (i >= dexArr.length) {
                return;
            }
            Class.forName(dexArr[i].canaryClass);
            i++;
        }
    }

    public DexManifest(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        C0eW c0eW = C0eW.NONE;
        String str = DexStoreUtils.MAIN_DEX_STORE_ID;
        ArrayList arrayList2 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, ReactWebViewManager.HTML_ENCODING));
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.length() != 0) {
                        Mlog.safeFmt("Secondary program dex metadata: [%s]", readLine);
                        if (readLine.equals(".root_relative")) {
                            z = true;
                        } else if (readLine.equals(".locators")) {
                            z2 = true;
                        } else if (readLine.startsWith(".superpack_files")) {
                            i = Integer.parseInt(readLine.split(" ")[1]);
                        } else if (readLine.startsWith(".superpack_extension")) {
                            String str2 = readLine.split(" ")[1];
                            if (!str2.isEmpty()) {
                                if (str2.equalsIgnoreCase("xz")) {
                                    c0eW = C0eW.XZ;
                                } else if (!str2.equalsIgnoreCase("zst") && !str2.equalsIgnoreCase("zstd")) {
                                    if (str2.equalsIgnoreCase("spo")) {
                                        c0eW = C0eW.OB;
                                    }
                                } else {
                                    c0eW = C0eW.ZST;
                                }
                            }
                            c0eW = c0eW;
                        } else if (readLine.startsWith(".id")) {
                            str = readLine.split(" ")[1];
                        } else if (readLine.startsWith(".requires")) {
                            arrayList2.add(readLine.split(" ")[1]);
                        } else if (readLine.startsWith(".")) {
                            Mlog.w("ignoring dex metadata pragma [%s]", readLine);
                        } else {
                            String[] split = readLine.split(" ");
                            arrayList.add(new Dex(split[0], split[1], split[2]));
                        }
                    }
                } else {
                    bufferedReader.close();
                    this.rootRelative = z;
                    this.locators = z2;
                    this.superpackFiles = i;
                    this.superpackExtension = c0eW;
                    this.id = str;
                    this.requires = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    this.dexes = (Dex[]) arrayList.toArray(new Dex[arrayList.size()]);
                    this.isArtMainStore = false;
                    return;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
    }

    public static DexManifest loadManifestFrom(ResProvider resProvider, String str, boolean z) {
        InputStream open = resProvider.open(str);
        try {
            DexManifest dexManifest = new DexManifest(open);
            if (open != null) {
                open.close();
            }
            if (z && dexManifest.rootRelative) {
                resProvider.markRootRelative();
            }
            return dexManifest;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public DexManifest() {
        this.dexes = (Dex[]) new ArrayList().toArray(new Dex[0]);
        this.rootRelative = false;
        this.locators = false;
        this.superpackFiles = 0;
        this.superpackExtension = C0eW.NONE;
        this.id = DexStoreUtils.MAIN_DEX_STORE_ID;
        this.requires = (String[]) new ArrayList().toArray(new String[0]);
        this.isArtMainStore = true;
    }
}
