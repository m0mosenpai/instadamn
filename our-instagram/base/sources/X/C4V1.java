package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4V1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4V1 {
    /* JADX WARN: Type inference failed for: r3v1, types: [X.5fi] */
    public static C121905fi A00(C4SS c4ss, C95794Sn c95794Sn, final ServiceEventCallbackImpl serviceEventCallbackImpl, HeroPlayerSetting heroPlayerSetting, final String str, final boolean z) {
        C4AN c4an = c4ss.A0K;
        final String str2 = c4an.A0G;
        if (str2 == null) {
            AbstractC459729h.A02("AbrMonitorFactory", "request.mVideoSource.mVideoId is null", new Object[0]);
        } else if (heroPlayerSetting.A1I) {
            final long j = c95794Sn.A0q;
            final boolean A03 = c4an.A03();
            final boolean z2 = heroPlayerSetting.A0w.A0a;
            return new C2BH(serviceEventCallbackImpl, str2, str, j, A03, z, z2) { // from class: X.5fi
                public C121915fj A00;
                public final VpsEventCallback A01;

                @Override // X.C2BH
                public final void ASO(C4B6 c4b6) {
                    C98494bS c98494bS;
                    C4B6 c4b62;
                    long j2;
                    int i;
                    C92264Bg c92264Bg;
                    C121915fj c121915fj = this.A00;
                    C92254Bf c92254Bf = c121915fj.A00;
                    if (c92254Bf != null) {
                        AbstractC121925fk.A00(c92254Bf, c121915fj.A05, c4b6, c121915fj.A07, -1, c121915fj.A04, c121915fj.A09, c121915fj.A08, false, c121915fj.A03);
                        C92254Bf c92254Bf2 = c121915fj.A00;
                        if (c92254Bf2 != null && (c4b62 = c92254Bf2.A01) != null) {
                            String str3 = c4b62.A0N.A07;
                            if (str3 == null || str3.isEmpty()) {
                                str3 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                            }
                            Map map = c92254Bf2.A07;
                            if (map.containsKey(str3) && (c92264Bg = (C92264Bg) map.get(str3)) != null) {
                                j2 = c92264Bg.A02;
                                i = c92264Bg.A00;
                            } else {
                                j2 = -1;
                                i = -1;
                            }
                            HashMap hashMap = new HashMap();
                            Map map2 = c121915fj.A00.A07;
                            String str4 = c4b62.A0N.A07;
                            C92264Bg c92264Bg2 = (C92264Bg) map2.get(str4);
                            if (c92264Bg2 != null) {
                                StringBuilder sb = new StringBuilder();
                                C92254Bf.A00(c92264Bg2, str4, sb);
                                sb.toString();
                            }
                            c121915fj.A00.A01();
                            c98494bS = new C98494bS(c121915fj.A00.A02(), hashMap, i, j2);
                        } else {
                            c98494bS = null;
                        }
                        c121915fj.A01 = c98494bS;
                        c121915fj.A00 = null;
                    }
                }

                @Override // X.C2BH
                public final void A7q(EnumC92204Ba enumC92204Ba) {
                    C92254Bf c92254Bf = this.A00.A00;
                    if (c92254Bf != null) {
                        c92254Bf.A0I.add(enumC92204Ba);
                    }
                }

                @Override // X.C2BH
                public final void A7r(EnumC96564Vr enumC96564Vr, String str3) {
                    C92254Bf c92254Bf = this.A00.A00;
                    if (c92254Bf != null) {
                        c92254Bf.A03(enumC96564Vr, str3);
                    }
                }

                @Override // X.C2BH
                public final void A8f(String str3, int i, long j2, long j3, long j4, long j5) {
                    C92254Bf c92254Bf = this.A00.A00;
                    if (c92254Bf != null) {
                        c92254Bf.A04(str3, i, j2, j3, j4, j5);
                    }
                }

                @Override // X.C2BH
                public final C121915fj AXp() {
                    return this.A00;
                }

                @Override // X.C2BH
                public final void En0(C4B6 c4b6, C4B6 c4b62, C4B6 c4b63, String str3, String str4, String str5, String str6, String str7, List list, C4B6[] c4b6Arr, float f, int i, long j2, long j3, long j4, long j5, boolean z3) {
                    C121915fj c121915fj = this.A00;
                    c121915fj.A00 = new C92254Bf(c4b6, c4b62, c4b63, str3, str5, str6, str7, c121915fj.A02, list, c4b6Arr, f, i, j2, j3, j4, j5, z3);
                }

                {
                    this.A01 = serviceEventCallbackImpl;
                    this.A00 = new C121915fj(serviceEventCallbackImpl, str2, str, j, A03, z, z2);
                }
            };
        }
        return null;
    }
}
