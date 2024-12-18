package X;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashMap;

/* renamed from: X.6WW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WW implements InterfaceC145136gY {
    public V41 A00;
    public V42 A01;
    public C41181vS A02;
    public String A03;
    public boolean A04;
    public C54607OAi A05;
    public Runnable A06;
    public final Activity A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final InterfaceC1118853a A0A;
    public final String A0B;
    public final String A0C;

    public C6WW(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC1118853a interfaceC1118853a, String str, String str2) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 5);
        C14360o3.A0B(str2, 6);
        this.A07 = activity;
        this.A09 = userSession;
        this.A0A = interfaceC1118853a;
        this.A08 = interfaceC11380iw;
        this.A0B = str;
        this.A0C = str2;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DXv(String str) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DhB() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroyView() {
    }

    public final void A00() {
        C54607OAi c54607OAi;
        View view;
        Runnable runnable = this.A06;
        if (runnable != null && (c54607OAi = this.A05) != null && (view = (View) c54607OAi.A02.getValue()) != null) {
            view.removeCallbacks(runnable);
        }
        this.A06 = null;
        C54607OAi c54607OAi2 = this.A05;
        if (c54607OAi2 != null) {
            c54607OAi2.A00.setVisibility(8);
        }
    }

    public final void A01() {
        RunnableC71394Wt3 runnableC71394Wt3;
        long j;
        String str;
        long j2;
        Long l;
        C38321qM c38321qM;
        C38321qM c38321qM2;
        String A38;
        Long A0k;
        Long A0k2;
        C69130ViL c69130ViL;
        String str2;
        Long A0k3;
        View view;
        if (this.A01 != null || this.A00 != null) {
            C54607OAi c54607OAi = this.A05;
            if (c54607OAi != null) {
                c54607OAi.A00.setVisibility(0);
            }
            C54607OAi c54607OAi2 = this.A05;
            if (c54607OAi2 != null && (view = (View) c54607OAi2.A02.getValue()) != null) {
                runnableC71394Wt3 = new RunnableC71394Wt3(this);
                view.postDelayed(runnableC71394Wt3, 7500L);
            } else {
                runnableC71394Wt3 = null;
            }
            this.A06 = runnableC71394Wt3;
            InterfaceC1118853a interfaceC1118853a = this.A0A;
            interfaceC1118853a.EJE("media_level_survey_shown");
            V42 v42 = this.A01;
            String str3 = "";
            long j3 = -1;
            if (v42 != null) {
                String str4 = v42.A01;
                if (str4 != null) {
                    str3 = str4;
                }
                C69129ViK c69129ViK = v42.A00;
                if (c69129ViK != null && (c69130ViL = c69129ViK.A01) != null && (str2 = c69130ViL.A00) != null && (A0k3 = AbstractC003100w.A0k(10, str2)) != null) {
                    j = A0k3.longValue();
                } else {
                    j = -1;
                }
                String str5 = this.A03;
                if (str5 != null && (A0k2 = AbstractC003100w.A0k(10, str5)) != null) {
                    j3 = A0k2.longValue();
                }
            } else {
                V41 v41 = this.A00;
                if (v41 != null && (str = v41.A01) != null) {
                    str3 = str;
                }
                j3 = Long.parseLong("1750502288572541");
                j = -1;
            }
            C41181vS AuU = interfaceC1118853a.AuU();
            C41551w4 c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a;
            String str6 = this.A0C;
            String str7 = this.A0B;
            if (AuU != null && (c38321qM2 = AuU.A0b) != null && (A38 = c38321qM2.A38()) != null && (A0k = AbstractC003100w.A0k(10, A38)) != null) {
                j2 = A0k.longValue();
            } else {
                j2 = -1;
            }
            String str8 = null;
            if (c41551w4 != null) {
                l = Long.valueOf(c41551w4.A0E);
            } else {
                l = null;
            }
            if (AuU != null && (c38321qM = AuU.A0b) != null) {
                str8 = c38321qM.A0C.getLoggingInfoToken();
            }
            AbstractC68579VWg.A00(this.A09).A03(new C41596Iaj(Long.valueOf(j2), l, str8, str6, str7), str3, this.A08.getModuleName(), j, j3);
        }
    }

    public final boolean A02() {
        View view;
        C54607OAi c54607OAi = this.A05;
        if (c54607OAi == null || (view = (View) c54607OAi.A02.getValue()) == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        String str;
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Double d9;
        Double d10;
        Double d11;
        Double d12;
        Double d13;
        Double d14;
        Double d15;
        String loggingInfoToken;
        C14360o3.A0B(interfaceC143576dw, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c41551w4, 3);
        if (!C14360o3.A0K(this.A02, c41181vS)) {
            Double d16 = null;
            this.A01 = null;
            this.A00 = null;
            this.A04 = false;
            this.A02 = c41181vS;
            if (interfaceC143576dw instanceof C143556du) {
                UserSession userSession = this.A09;
                OVF ovf = OVF.A00;
                if (ovf.A00(userSession, c41181vS, c41551w4) != null) {
                    this.A05 = ((C143556du) interfaceC143576dw).A0G;
                    String A00 = ovf.A00(userSession, c41181vS, c41551w4);
                    this.A03 = A00;
                    if (A00 != null) {
                        if (C18U.A06(C06090Tz.A05, userSession, 36320395233927607L)) {
                            if (C1VN.A00 != null) {
                                C70188WFr.A02(new C67935V3a(c41181vS, this), userSession, A00);
                                return;
                            }
                            return;
                        }
                        String str2 = this.A0B;
                        String str3 = this.A0C;
                        C38491qd c38491qd = c41551w4.A0H.A0M;
                        C38321qM c38321qM = c41181vS.A0b;
                        if (c38321qM != null) {
                            str = c38321qM.A38();
                        } else {
                            str = null;
                        }
                        String str4 = "";
                        if (str == null) {
                            str = "";
                        }
                        C09530e4 c09530e4 = new C09530e4("media_id", str);
                        C09530e4 c09530e42 = new C09530e4("position_in_tray", String.valueOf(c41551w4.A0E));
                        if (c38321qM != null && (loggingInfoToken = c38321qM.A0C.getLoggingInfoToken()) != null) {
                            str4 = loggingInfoToken;
                        }
                        C09530e4 c09530e43 = new C09530e4("ranking_info_token", str4);
                        C09530e4 c09530e44 = new C09530e4("tray_session_id", str2);
                        C09530e4 c09530e45 = new C09530e4("viewer_session_id", str3);
                        if (c38491qd != null) {
                            d = c38491qd.A0U;
                        } else {
                            d = null;
                        }
                        C09530e4 c09530e46 = new C09530e4("stories_normalized_ptime_spent_gpu", String.valueOf(d));
                        if (c38491qd != null) {
                            d2 = c38491qd.A0O;
                        } else {
                            d2 = null;
                        }
                        C09530e4 c09530e47 = new C09530e4("is_reciprocal_convos_send_mtml", String.valueOf(d2));
                        if (c38491qd != null) {
                            d3 = c38491qd.A0K;
                        } else {
                            d3 = null;
                        }
                        C09530e4 c09530e48 = new C09530e4("pviewer_or_author_contact", String.valueOf(d3));
                        if (c38491qd != null) {
                            d4 = c38491qd.A0T;
                        } else {
                            d4 = null;
                        }
                        C09530e4 c09530e49 = new C09530e4("stories_ptap_new_mtml_gpu", String.valueOf(d4));
                        if (c38491qd != null) {
                            d5 = c38491qd.A0L;
                        } else {
                            d5 = null;
                        }
                        C09530e4 c09530e410 = new C09530e4("stories_evpvd_mtml_gpu", String.valueOf(d5));
                        if (c38491qd != null) {
                            d6 = c38491qd.A04;
                        } else {
                            d6 = null;
                        }
                        C09530e4 c09530e411 = new C09530e4("stories_emeimps_rate_mtml_gpu", String.valueOf(d6));
                        if (c38491qd != null) {
                            d7 = c38491qd.A0N;
                        } else {
                            d7 = null;
                        }
                        C09530e4 c09530e412 = new C09530e4("stories_pnext_pos_gpu", String.valueOf(d7));
                        if (c38491qd != null) {
                            d8 = c38491qd.A05;
                        } else {
                            d8 = null;
                        }
                        C09530e4 c09530e413 = new C09530e4("stories_preply_bar_tap_time_spent_rate_3_5_sec_gpu", String.valueOf(d8));
                        if (c38491qd != null) {
                            d9 = c38491qd.A0M;
                        } else {
                            d9 = null;
                        }
                        C09530e4 c09530e414 = new C09530e4("stories_plike_mtml_gpu", String.valueOf(d9));
                        if (c38491qd != null) {
                            d10 = c38491qd.A0S;
                        } else {
                            d10 = null;
                        }
                        C09530e4 c09530e415 = new C09530e4("stories_pskip_photos_075_videos_085_gpu", String.valueOf(d10));
                        if (c38491qd != null) {
                            d11 = c38491qd.A0P;
                        } else {
                            d11 = null;
                        }
                        C09530e4 c09530e416 = new C09530e4("stories_preply_bar_tap_time_spent_3_5_sec_gpu", String.valueOf(d11));
                        if (c38491qd != null) {
                            d12 = c38491qd.A00;
                        } else {
                            d12 = null;
                        }
                        C09530e4 c09530e417 = new C09530e4("adjust_ide_holdout_scores", String.valueOf(d12));
                        if (c38491qd != null) {
                            d13 = c38491qd.A01;
                        } else {
                            d13 = null;
                        }
                        C09530e4 c09530e418 = new C09530e4("adjust_integrity_scores", String.valueOf(d13));
                        if (c38491qd != null) {
                            d14 = c38491qd.A02;
                        } else {
                            d14 = null;
                        }
                        C09530e4 c09530e419 = new C09530e4("bff_scores", String.valueOf(d14));
                        if (c38491qd != null) {
                            d15 = c38491qd.A07;
                        } else {
                            d15 = null;
                        }
                        C09530e4 c09530e420 = new C09530e4("general_vm_scores_final", String.valueOf(d15));
                        if (c38491qd != null) {
                            d16 = c38491qd.A03;
                        }
                        HashMap A02 = AbstractC06930Yk.A02(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, c09530e48, c09530e49, c09530e410, c09530e411, c09530e412, c09530e413, c09530e414, c09530e415, c09530e416, c09530e417, c09530e418, c09530e419, c09530e420, new C09530e4("crown_vm_scores_final", String.valueOf(d16)));
                        if (C1VN.A00 == null) {
                            return;
                        }
                        C70188WFr.A03(new V3Z(c41181vS, this), userSession, A00, A02);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DsD() {
        return false;
    }
}
