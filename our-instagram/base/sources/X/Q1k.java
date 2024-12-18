package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.view.View;
import androidx.test.core.app.InstrumentationActivityInvoker;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.networkreachability.NetworkState;
import com.facebook.forker.Process;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactBoostPostModule;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class Q1k extends BroadcastReceiver {
    public final int A00;
    public final Object A01;

    public Q1k(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A04;
        int i;
        ArrayList A1F;
        int i2;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        int A042;
        LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4;
        int i3;
        C62686SMa c62686SMa;
        NetworkState A00;
        NetworkState networkState;
        C64489TFz c64489TFz;
        C63343Shy c63343Shy;
        switch (this.A00) {
            case 0:
                A042 = AbstractC58318PtA.A04(this, context, intent, -112949807);
                SOP sop = (SOP) this.A01;
                if (sop instanceof C58724Q5a) {
                    layoutInflaterFactory2C52042a4 = ((C58724Q5a) sop).A01;
                } else {
                    layoutInflaterFactory2C52042a4 = ((Q5Z) sop).A01;
                }
                LayoutInflaterFactory2C52042a4.A0E(layoutInflaterFactory2C52042a4, true, true);
                i3 = -389097971;
                C0f9.A0E(i3, A042, intent);
                return;
            case 1:
                A042 = AbstractC58318PtA.A04(this, context, intent, -718309746);
                InstrumentationActivityInvoker.BootstrapActivity bootstrapActivity = (InstrumentationActivityInvoker.BootstrapActivity) this.A01;
                bootstrapActivity.finishActivity(0);
                bootstrapActivity.finish();
                i3 = 1950869714;
                C0f9.A0E(i3, A042, intent);
                return;
            case 2:
                A042 = AbstractC58318PtA.A04(this, context, intent, -253777063);
                ((InstrumentationActivityInvoker.EmptyActivity) this.A01).finish();
                i3 = 726670825;
                C0f9.A0E(i3, A042, intent);
                return;
            case 3:
                A042 = AbstractC58318PtA.A04(this, context, intent, 359985466);
                ((InstrumentationActivityInvoker.EmptyFloatingActivity) this.A01).finish();
                i3 = 1421055347;
                C0f9.A0E(i3, A042, intent);
                return;
            case 4:
                A042 = AbstractC58318PtA.A04(this, context, intent, 2097541487);
                if (intent == null || !intent.getBooleanExtra("noConnectivity", false)) {
                    ((View) this.A01).invalidate();
                }
                i3 = -319591423;
                C0f9.A0E(i3, A042, intent);
                return;
            case 5:
                A042 = AbstractC58318PtA.A04(this, context, intent, 1476028079);
                AbstractC167017dG.A1N(context, intent);
                String action = intent.getAction();
                if (action != null && action.equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE") && (A00 = (c62686SMa = (C62686SMa) this.A01).A00()) != (networkState = c62686SMa.A00)) {
                    c62686SMa.A03.networkStateChanged(A00.A00, networkState.A00);
                    c62686SMa.A00 = A00;
                }
                i3 = 799322574;
                C0f9.A0E(i3, A042, intent);
                return;
            case 6:
                A042 = AbstractC58318PtA.A04(this, context, intent, 613356678);
                String action2 = intent.getAction();
                ExecutorServiceC64921TZw executorServiceC64921TZw = (ExecutorServiceC64921TZw) this.A01;
                if (!S10.A00(action2, executorServiceC64921TZw.A01)) {
                    i3 = 594548573;
                } else {
                    ExecutorServiceC64921TZw.A01(executorServiceC64921TZw);
                    i3 = -395211788;
                }
                C0f9.A0E(i3, A042, intent);
                return;
            case 7:
                A04 = AbstractC58318PtA.A04(this, context, intent, 2071197917);
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                    C63006SaU c63006SaU = (C63006SaU) this.A01;
                    C63006SaU.A00(networkInfo, c63006SaU);
                    if (isInitialStickyBroadcast()) {
                        i = 893513987;
                        break;
                    } else {
                        SMD A03 = c63006SaU.A03();
                        Intent A0E = AbstractC58318PtA.A0E("com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED");
                        A0E.putExtra("com.facebook.mqtt.EXTRA_NETWORK_TYPE", A03.A00);
                        synchronized (c63006SaU) {
                            A1F = AbstractC166987dD.A1F(c63006SaU.A04);
                        }
                        Iterator it = A1F.iterator();
                        while (it.hasNext()) {
                            SBW sbw = (SBW) it.next();
                            if (S10.A00(A0E.getAction(), "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED")) {
                                C63367SiS.A00(A0E, sbw.A00);
                            }
                        }
                    }
                }
                i = 856218682;
                break;
            case 8:
                A04 = AbstractC58318PtA.A04(this, context, intent, 1323576756);
                String action3 = intent.getAction();
                C63344Shz c63344Shz = (C63344Shz) this.A01;
                if (!S10.A00(action3, c63344Shz.A0J)) {
                    i = -1985198;
                    break;
                } else {
                    synchronized (c63344Shz) {
                        try {
                            long elapsedRealtime = SystemClock.elapsedRealtime() - c63344Shz.A01;
                            intent.getAction();
                            if (elapsedRealtime > 0) {
                                c63344Shz.A0H.A06("mqtt_keepalive_delay", AbstractC62801SRv.A01("keepalive_delay_ms", Long.toString(elapsedRealtime)));
                            }
                            long j = c63344Shz.A00;
                            if (j >= c63344Shz.A05) {
                                i = 997965508;
                                break;
                            } else {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                c63344Shz.A01 = elapsedRealtime2;
                                if (c63344Shz.A03) {
                                    C63344Shz.A01(c63344Shz.A08, c63344Shz, elapsedRealtime2);
                                }
                                c63344Shz.A0P.run();
                                i = 1149037641;
                                break;
                            }
                        } catch (Throwable th) {
                            C0f9.A0E(126072304, A04, intent);
                            throw th;
                        }
                    }
                }
            case 9:
                int A043 = AbstractC58318PtA.A04(this, context, intent, 1654585752);
                String action4 = intent.getAction();
                C63344Shz c63344Shz2 = (C63344Shz) this.A01;
                if (!S10.A00(action4, c63344Shz2.A0K)) {
                    i2 = 1454019520;
                } else {
                    synchronized (c63344Shz2) {
                        try {
                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - c63344Shz2.A01;
                            intent.getAction();
                            if (elapsedRealtime3 > 0) {
                                c63344Shz2.A0H.A06("mqtt_keepalive_delay", AbstractC62801SRv.A01("keepalive_delay_ms", Long.toString(elapsedRealtime3)));
                            }
                            boolean z = c63344Shz2.A0M;
                            if (!z && (pendingIntent2 = c63344Shz2.A07) != null) {
                                c63344Shz2.A0G.A03(c63344Shz2.A06, pendingIntent2);
                            }
                            long elapsedRealtime4 = SystemClock.elapsedRealtime() + c63344Shz2.A02;
                            if (c63344Shz2.A03 && c63344Shz2.A04 >= 23 && z && (pendingIntent = c63344Shz2.A09) != null) {
                                c63344Shz2.A0G.A02(c63344Shz2.A06, 2, elapsedRealtime4, pendingIntent);
                            }
                            if (c63344Shz2.A00 < c63344Shz2.A05) {
                                i2 = -1367302429;
                            } else {
                                c63344Shz2.A01 = elapsedRealtime4;
                                if (c63344Shz2.A03 && !z) {
                                    C63344Shz.A01(c63344Shz2.A07, c63344Shz2, elapsedRealtime4 + 20000);
                                }
                                c63344Shz2.A0P.run();
                                i2 = 721822788;
                            }
                        } catch (Throwable th2) {
                            C0f9.A0E(1475794416, A043, intent);
                            throw th2;
                        }
                    }
                }
                C0f9.A0E(i2, A043, intent);
                return;
            case 10:
                A042 = AbstractC58318PtA.A04(this, context, intent, 1313512656);
                String action5 = intent.getAction();
                C63344Shz c63344Shz3 = (C63344Shz) this.A01;
                if (!S10.A00(action5, c63344Shz3.A0I)) {
                    i3 = 241978215;
                } else {
                    synchronized (c63344Shz3) {
                        try {
                            intent.getAction();
                            SystemClock.elapsedRealtime();
                            long j2 = c63344Shz3.A00;
                            if (j2 < c63344Shz3.A05) {
                                i3 = -93760644;
                            } else {
                                long elapsedRealtime5 = SystemClock.elapsedRealtime();
                                if (elapsedRealtime5 < c63344Shz3.A01) {
                                    i3 = 360025332;
                                } else {
                                    c63344Shz3.A01 = elapsedRealtime5 + j2;
                                    PendingIntent pendingIntent3 = c63344Shz3.A09;
                                    if (pendingIntent3 != null) {
                                        c63344Shz3.A0G.A03(c63344Shz3.A06, pendingIntent3);
                                    }
                                    if (c63344Shz3.A03) {
                                        C63344Shz.A02(pendingIntent3, c63344Shz3, c63344Shz3.A01);
                                        C63344Shz.A01(c63344Shz3.A07, c63344Shz3, c63344Shz3.A01 + 20000);
                                    }
                                    c63344Shz3.A0P.run();
                                    i3 = 669769027;
                                }
                            }
                        } catch (Throwable th3) {
                            C0f9.A0E(-1176191247, A042, intent);
                            throw th3;
                        }
                    }
                }
                C0f9.A0E(i3, A042, intent);
                return;
            case 11:
                A042 = AbstractC58318PtA.A04(this, context, intent, 1202724665);
                String action6 = intent.getAction();
                C62975SZv c62975SZv = (C62975SZv) this.A01;
                if (!S10.A00(action6, c62975SZv.A08)) {
                    i3 = 1290445616;
                } else {
                    intent.getAction();
                    c62975SZv.A0C.run();
                    i3 = -1004940787;
                }
                C0f9.A0E(i3, A042, intent);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A042 = AbstractC58318PtA.A04(this, context, intent, 1023952170);
                C63367SiS c63367SiS = (C63367SiS) this.A01;
                if (intent == null) {
                    i3 = 584287127;
                } else if (!S10.A00(intent.getAction(), "android.os.action.POWER_SAVE_MODE_CHANGED")) {
                    i3 = -1641493495;
                } else {
                    C63367SiS.A00(intent, c63367SiS);
                    i3 = 573007605;
                }
                C0f9.A0E(i3, A042, intent);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A042 = AbstractC58318PtA.A04(this, context, intent, -1722511978);
                if (intent == null) {
                    i3 = 727581135;
                } else {
                    C63367SiS c63367SiS2 = (C63367SiS) this.A01;
                    intent.getAction();
                    C63367SiS.A00(intent, c63367SiS2);
                    i3 = -543960326;
                }
                C0f9.A0E(i3, A042, intent);
                return;
            case 14:
                A042 = AbstractC58318PtA.A04(this, context, intent, 1372713328);
                if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction()) && (c63343Shy = (c64489TFz = (C64489TFz) this.A01).A02) != null && c63343Shy.A0I == C05F.A00) {
                    c64489TFz.A03();
                }
                i3 = -1570626769;
                C0f9.A0E(i3, A042, intent);
                return;
            case Process.SIGTERM /* 15 */:
                A042 = AbstractC58318PtA.A04(this, context, intent, 1161616192);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) ((IgReactBoostPostModule) this.A01).mReactContext.A03(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("IGBoostPostSubmitSuccessNotification", null);
                i3 = -772744604;
                C0f9.A0E(i3, A042, intent);
                return;
            default:
                A042 = AbstractC58318PtA.A04(this, context, intent, -840250467);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) ((IgReactBoostPostModule) this.A01).mReactContext.A03(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("IGBoostPostRefreshPromotionInsights", null);
                i3 = -1849923389;
                C0f9.A0E(i3, A042, intent);
                return;
        }
        C0f9.A0E(i, A04, intent);
    }
}
