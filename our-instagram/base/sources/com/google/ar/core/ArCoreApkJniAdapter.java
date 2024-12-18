package com.google.ar.core;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C61261Rjz;
import X.C62647SKg;
import X.C62915SWw;
import X.C63278Sgd;
import X.C64856TXh;
import X.C64858TXj;
import X.EnumC61066Ref;
import X.EnumC61187Rgn;
import X.RPI;
import X.RPJ;
import X.RPK;
import X.RPU;
import X.RPV;
import X.RPW;
import X.RPX;
import X.RPY;
import X.TQ8;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ArCoreApkJniAdapter {
    public static final Map a;

    public static int checkAvailability(Context context) {
        EnumC61066Ref enumC61066Ref;
        try {
            C63278Sgd c63278Sgd = C63278Sgd.A06;
            try {
                C63278Sgd.A01(context, c63278Sgd);
                if (C63278Sgd.A00(context) != 0 && C63278Sgd.A00(context) < c63278Sgd.A00) {
                    synchronized (c63278Sgd) {
                        EnumC61066Ref enumC61066Ref2 = c63278Sgd.A01;
                        if ((enumC61066Ref2 == null || (enumC61066Ref2 instanceof RPK) || (enumC61066Ref2 instanceof RPJ) || (enumC61066Ref2 instanceof RPI)) && !c63278Sgd.A03) {
                            c63278Sgd.A03 = true;
                            C62647SKg c62647SKg = new C62647SKg(c63278Sgd);
                            C63278Sgd.A01(context, c63278Sgd);
                            if (C63278Sgd.A00(context) != 0 && C63278Sgd.A00(context) < c63278Sgd.A00) {
                                if (C63278Sgd.A00(context) != -1) {
                                    c62647SKg.A00(EnumC61066Ref.A01);
                                } else {
                                    C63278Sgd.A01(context, c63278Sgd);
                                    if (c63278Sgd.A04) {
                                        c62647SKg.A00(EnumC61066Ref.A03);
                                    } else {
                                        synchronized (c63278Sgd) {
                                            try {
                                                C62915SWw c62915SWw = c63278Sgd.A02;
                                                if (c62915SWw == null) {
                                                    c62915SWw = new C62915SWw(null);
                                                    Context applicationContext = context.getApplicationContext();
                                                    synchronized (c62915SWw) {
                                                        c62915SWw.A00 = applicationContext;
                                                        Intent intent = AbstractC58318PtA.A0E("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending");
                                                        ServiceConnection serviceConnection = c62915SWw.A02;
                                                        if (applicationContext.bindService(intent, serviceConnection, 1)) {
                                                            c62915SWw.A04 = 2;
                                                        } else {
                                                            c62915SWw.A04 = 1;
                                                            c62915SWw.A00 = null;
                                                            Log.w("ARCore-InstallService", "bindService returned false.");
                                                            applicationContext.unbindService(serviceConnection);
                                                        }
                                                    }
                                                    c63278Sgd.A02 = c62915SWw;
                                                }
                                                try {
                                                    synchronized (c62915SWw) {
                                                        try {
                                                            TQ8 tq8 = new TQ8(context, c62647SKg, c62915SWw);
                                                            synchronized (c62915SWw) {
                                                                int i = c62915SWw.A04;
                                                                int i2 = i - 1;
                                                                if (i != 0) {
                                                                    if (i2 != 0) {
                                                                        if (i2 != 1) {
                                                                            if (i2 == 2) {
                                                                                tq8.run();
                                                                            }
                                                                        } else {
                                                                            c62915SWw.A03.offer(tq8);
                                                                        }
                                                                    } else {
                                                                        throw new C61261Rjz();
                                                                    }
                                                                } else {
                                                                    throw null;
                                                                }
                                                            }
                                                        } catch (C61261Rjz unused) {
                                                            Log.e("ARCore-InstallService", "Play Store install service could not be bound.");
                                                            c62647SKg.A00(EnumC61066Ref.A05);
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                }
                            } else {
                                c62647SKg.A00(EnumC61066Ref.A02);
                            }
                        }
                        enumC61066Ref = c63278Sgd.A01;
                        if (enumC61066Ref == null) {
                            if (c63278Sgd.A03) {
                                enumC61066Ref = EnumC61066Ref.A04;
                            } else {
                                Log.e("ARCore-ArCoreApk", "request not running but result is null?");
                                enumC61066Ref = EnumC61066Ref.A05;
                            }
                        }
                    }
                } else {
                    synchronized (c63278Sgd) {
                        C62915SWw c62915SWw2 = c63278Sgd.A02;
                        if (c62915SWw2 != null) {
                            synchronized (c62915SWw2) {
                                int i3 = c62915SWw2.A04;
                                int i4 = i3 - 1;
                                if (i3 != 0) {
                                    if (i4 == 1 || i4 == 2) {
                                        c62915SWw2.A00.unbindService(c62915SWw2.A02);
                                        c62915SWw2.A00 = null;
                                        c62915SWw2.A04 = 1;
                                    }
                                } else {
                                    throw null;
                                }
                            }
                            c63278Sgd.A02 = null;
                        }
                    }
                    try {
                        try {
                            try {
                                Bundle call = context.getContentResolver().call(AbstractC58320PtC.A0D().authority("com.google.ar.core.services.arcorecontentprovider").path("").build(), "getSetupIntent", context.getPackageName(), (Bundle) null);
                                if (call != null) {
                                    if (((PendingIntent) call.getParcelable("intent")) != null) {
                                        enumC61066Ref = EnumC61066Ref.A01;
                                    } else {
                                        String string = call.getString("exceptionType", "");
                                        if (!string.isEmpty()) {
                                            if (!string.equals(RPW.class.getName())) {
                                                if (!string.equals(RPY.class.getName())) {
                                                    Class<? extends U> asSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                                                    String string2 = call.getString("exceptionText", null);
                                                    if (string2 != null) {
                                                        throw ((RuntimeException) asSubclass.getConstructor(String.class).newInstance(string2));
                                                    }
                                                    throw ((RuntimeException) asSubclass.getConstructor(new Class[0]).newInstance(new Object[0]));
                                                }
                                                throw new Exception();
                                            }
                                            throw new Exception();
                                        }
                                    }
                                }
                            } catch (ReflectiveOperationException | RuntimeException unused2) {
                            }
                            enumC61066Ref = EnumC61066Ref.A02;
                        } catch (RPY | RuntimeException unused3) {
                            enumC61066Ref = EnumC61066Ref.A05;
                        }
                    } catch (RPW unused4) {
                        enumC61066Ref = EnumC61066Ref.A06;
                    }
                }
            } catch (C64856TXh e) {
                Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e);
                enumC61066Ref = EnumC61066Ref.A05;
            }
            return enumC61066Ref.A00;
        } catch (Throwable th2) {
            Log.e("ARCore-ArCoreApkJniAdapter", "Exception details:", th2);
            Map map = a;
            Class<?> cls = th2.getClass();
            if (map.containsKey(cls)) {
                map.get(cls);
            }
            return EnumC61066Ref.A05.A00;
        }
    }

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        a = A1G;
        A1G.put(IllegalArgumentException.class, Integer.valueOf(EnumC61187Rgn.A09.A00));
        A1G.put(C64858TXj.class, Integer.valueOf(EnumC61187Rgn.A0A.A00));
        A1G.put(RPV.class, Integer.valueOf(EnumC61187Rgn.A04.A00));
        A1G.put(RPW.class, Integer.valueOf(EnumC61187Rgn.A05.A00));
        A1G.put(RPU.class, Integer.valueOf(EnumC61187Rgn.A06.A00));
        A1G.put(RPX.class, Integer.valueOf(EnumC61187Rgn.A07.A00));
        A1G.put(RPY.class, Integer.valueOf(EnumC61187Rgn.A08.A00));
    }
}
