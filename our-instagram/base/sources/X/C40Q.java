package X;

import java.io.IOException;

/* renamed from: X.40Q, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C40Q {
    public static C40R parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            Boolean bool = null;
            Long l2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Long l3 = null;
            Boolean bool2 = null;
            String str5 = null;
            String str6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("adID".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("packageName".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("deepLinkURI".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (!"postAppInstallCallback".equals(A0q)) {
                    if ("trackingToken".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str4 = null;
                        } else {
                            str4 = c16l.A1P();
                        }
                    } else if ("trackingTime".equals(A0q)) {
                        l = Long.valueOf(c16l.A0y());
                    } else if ("sponsoredTrackingToken".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str5 = null;
                        } else {
                            str5 = c16l.A1P();
                        }
                    } else if ("isInstalled".equals(A0q)) {
                        bool = Boolean.valueOf(c16l.A0d());
                    } else if ("installedTime".equals(A0q)) {
                        l2 = Long.valueOf(c16l.A0y());
                    } else if ("openTime".equals(A0q)) {
                        l3 = Long.valueOf(c16l.A0y());
                    } else if ("receivedOnForeground".equals(A0q)) {
                        bool2 = Boolean.valueOf(c16l.A0d());
                    } else if ("storeInterface".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str6 = null;
                        } else {
                            str6 = c16l.A1P();
                        }
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("adID", "AppInstallNotifier.TrackedInstall");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("trackingToken", "AppInstallNotifier.TrackedInstall");
                } else if (l == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("trackingTime", "AppInstallNotifier.TrackedInstall");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("isInstalled", "AppInstallNotifier.TrackedInstall");
                } else if (l2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("installedTime", "AppInstallNotifier.TrackedInstall");
                } else if (l3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("openTime", "AppInstallNotifier.TrackedInstall");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("receivedOnForeground", "AppInstallNotifier.TrackedInstall");
                } else {
                    return new C40R(null, str, str2, str3, str4, str5, str6, l.longValue(), l2.longValue(), l3.longValue(), bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("packageName", "AppInstallNotifier.TrackedInstall");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
