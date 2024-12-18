package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.IGLiveGameStatus;
import com.instagram.api.schemas.IGLiveGames;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hks, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39782Hks {
    public static Map A00(InterfaceC37961pd interfaceC37961pd) {
        List list;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        String str;
        TreeUpdaterJNI treeUpdaterJNI4;
        String str2;
        List list2;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI9 = null;
        if (interfaceC37961pd.AaN() != null) {
            InterfaceC109904xI AaN = interfaceC37961pd.AaN();
            if (AaN != null) {
                treeUpdaterJNI8 = AaN.F7o();
            } else {
                treeUpdaterJNI8 = null;
            }
            A1I.put("affiliate_info", treeUpdaterJNI8);
        }
        if (interfaceC37961pd.AiH() != null) {
            InterfaceC109064vV AiH = interfaceC37961pd.AiH();
            if (AiH != null) {
                treeUpdaterJNI7 = AiH.F7o();
            } else {
                treeUpdaterJNI7 = null;
            }
            A1I.put("broadcast_experiments", treeUpdaterJNI7);
        }
        if (interfaceC37961pd.AiI() != null) {
            A1I.put(TraceFieldType.BroadcastId, interfaceC37961pd.AiI());
        }
        if (interfaceC37961pd.AiK() != null) {
            A1I.put("broadcast_message", interfaceC37961pd.AiK());
        }
        User AiL = interfaceC37961pd.AiL();
        if (AiL != null) {
            A1I.put("broadcast_owner", AiL.A07());
        }
        if (interfaceC37961pd.AiM() != null) {
            A1I.put(AbstractC111324zv.A00(769), interfaceC37961pd.AiM());
        }
        if (interfaceC37961pd.AiN() != null) {
            A1I.put("broadcast_status", interfaceC37961pd.AiN());
        }
        if (interfaceC37961pd.AnE() != null) {
            InterfaceC109924xK AnE = interfaceC37961pd.AnE();
            if (AnE != null) {
                treeUpdaterJNI6 = AnE.F7o();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1I.put("charity_info", treeUpdaterJNI6);
        }
        if (interfaceC37961pd.AnI() != null) {
            List<InterfaceC43538JKy> AnI = interfaceC37961pd.AnI();
            if (AnI != null) {
                ArrayList A0i = AbstractC167007dF.A0i(AnI);
                for (InterfaceC43538JKy interfaceC43538JKy : AnI) {
                    if (interfaceC43538JKy != null) {
                        treeUpdaterJNI5 = interfaceC43538JKy.F7o();
                    } else {
                        treeUpdaterJNI5 = null;
                    }
                    A0i.add(treeUpdaterJNI5);
                }
                list2 = AbstractC001800i.A0X(A0i);
            } else {
                list2 = null;
            }
            A1I.put("chat_info", list2);
        }
        List Aop = interfaceC37961pd.Aop();
        if (Aop != null) {
            ArrayList A0i2 = AbstractC167007dF.A0i(Aop);
            Iterator it = Aop.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0i2, it);
            }
            A1I.put("cobroadcasters", A0i2);
        }
        if (interfaceC37961pd.Aro() != null) {
            A1I.put("copyright_violation", interfaceC37961pd.Aro());
        }
        if (interfaceC37961pd.AsG() != null) {
            A1I.put("cover_frame_url", interfaceC37961pd.AsG());
        }
        if (interfaceC37961pd.AuQ() != null) {
            IGLiveGames AuQ = interfaceC37961pd.AuQ();
            if (AuQ != null) {
                str2 = AuQ.A00;
            } else {
                str2 = null;
            }
            A1I.put(AbstractC111324zv.A00(4224), str2);
        }
        if (interfaceC37961pd.AvW() != null) {
            A1I.put(AbstractC111324zv.A00(202), interfaceC37961pd.AvW());
        }
        if (interfaceC37961pd.getDashManifest() != null) {
            A1I.put("dash_manifest", interfaceC37961pd.getDashManifest());
        }
        if (interfaceC37961pd.AvY() != null) {
            A1I.put("dash_playback_url", interfaceC37961pd.AvY());
        }
        if (interfaceC37961pd.AxU() != null) {
            InterfaceC108554ug AxU = interfaceC37961pd.AxU();
            if (AxU != null) {
                treeUpdaterJNI4 = AxU.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put(AbstractC111324zv.A00(873), treeUpdaterJNI4);
        }
        if (interfaceC37961pd.B1q() != null) {
            A1I.put("encoding_tag", interfaceC37961pd.B1q());
        }
        if (interfaceC37961pd.B3A() != null) {
            A1I.put("expire_at", interfaceC37961pd.B3A());
        }
        if (interfaceC37961pd.B4R() != null) {
            A1I.put(MSV.A00(47), interfaceC37961pd.B4R());
        }
        if (interfaceC37961pd.B9S() != null) {
            IGLiveGameStatus B9S = interfaceC37961pd.B9S();
            if (B9S != null) {
                str = B9S.A00;
            } else {
                str = null;
            }
            A1I.put("game_status", str);
        }
        if (interfaceC37961pd.B9U() != null) {
            InterfaceC109944xO B9U = interfaceC37961pd.B9U();
            if (B9U != null) {
                treeUpdaterJNI3 = B9U.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put(AbstractC111324zv.A00(959), treeUpdaterJNI3);
        }
        if (interfaceC37961pd.BDi() != null) {
            A1I.put("hide_from_feed_unit", interfaceC37961pd.BDi());
        }
        if (interfaceC37961pd.BF7() != null) {
            AbstractC37300Gc1.A12(interfaceC37961pd.BF7(), A1I);
        }
        if (interfaceC37961pd.BGN() != null) {
            A1I.put("igtv_post_id", interfaceC37961pd.BGN());
        }
        if (interfaceC37961pd.BHU() != null) {
            A1I.put("index_position_in_response", interfaceC37961pd.BHU());
        }
        if (interfaceC37961pd.BJ5() != null) {
            A1I.put("internal_only", interfaceC37961pd.BJ5());
        }
        if (interfaceC37961pd.CU2() != null) {
            A1I.put("is_exclusive_live", interfaceC37961pd.CU2());
        }
        if (interfaceC37961pd.CUv() != null) {
            A1I.put("is_fit_green", interfaceC37961pd.CUv());
        }
        if (interfaceC37961pd.CXc() != null) {
            A1I.put(AbstractC111324zv.A00(1048), interfaceC37961pd.CXc());
        }
        if (interfaceC37961pd.CXd() != null) {
            A1I.put(AbstractC111324zv.A00(1049), interfaceC37961pd.CXd());
        }
        if (interfaceC37961pd.CZg() != null) {
            A1I.put(AbstractC111324zv.A00(4763), interfaceC37961pd.CZg());
        }
        if (interfaceC37961pd.CaW() != null) {
            A1I.put(AbstractC111324zv.A00(227), interfaceC37961pd.CaW());
        }
        if (interfaceC37961pd.CcP() != null) {
            A1I.put("is_scheduled_live", interfaceC37961pd.CcP());
        }
        if (interfaceC37961pd.Cfq() != null) {
            A1I.put(MSV.A00(55), interfaceC37961pd.Cfq());
        }
        if (interfaceC37961pd.BO1() != null) {
            A1I.put(AbstractC111324zv.A00(1081), interfaceC37961pd.BO1());
        }
        if (interfaceC37961pd.getMediaId() != null) {
            AbstractC37300Gc1.A18(interfaceC37961pd.getMediaId(), A1I);
        }
        if (interfaceC37961pd.BRN() != null) {
            InterfaceC109094vY BRN = interfaceC37961pd.BRN();
            if (BRN != null) {
                treeUpdaterJNI2 = BRN.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("media_overlay_info", treeUpdaterJNI2);
        }
        if (interfaceC37961pd.BVw() != null) {
            A1I.put("muted", interfaceC37961pd.BVw());
        }
        if (interfaceC37961pd.BYH() != null) {
            A1I.put("number_of_qualities", interfaceC37961pd.BYH());
        }
        if (interfaceC37961pd.getOrganicTrackingToken() != null) {
            A1I.put("organic_tracking_token", interfaceC37961pd.getOrganicTrackingToken());
        }
        if (interfaceC37961pd.Be6() != null) {
            A1I.put("playlist", interfaceC37961pd.Be6());
        }
        if (interfaceC37961pd.getPreview() != null) {
            A1I.put("preview", interfaceC37961pd.getPreview());
        }
        if (interfaceC37961pd.BiS() != null) {
            A1I.put("progressive_playback_url", interfaceC37961pd.BiS());
        }
        if (interfaceC37961pd.BjB() != null) {
            A1I.put("published_time", interfaceC37961pd.BjB());
        }
        if (interfaceC37961pd.BjX() != null) {
            A1I.put("question_pk", interfaceC37961pd.BjX());
        }
        if (interfaceC37961pd.Bk9() != null) {
            A1I.put("ranked_position", interfaceC37961pd.Bk9());
        }
        if (interfaceC37961pd.Bok() != null) {
            A1I.put(AbstractC58317Pt9.A00(130), interfaceC37961pd.Bok());
        }
        if (interfaceC37961pd.BsD() != null) {
            A1I.put("seen_ranked_position", interfaceC37961pd.BsD());
        }
        if (interfaceC37961pd.Bw3() != null) {
            A1I.put("show_bff_upsell", interfaceC37961pd.Bw3());
        }
        if (interfaceC37961pd.BxV() != null) {
            A1I.put("simulcast_fb_broadcast_id", interfaceC37961pd.BxV());
        }
        if (interfaceC37961pd.getSponsorTags() != null) {
            List<InterfaceC102194ip> sponsorTags = interfaceC37961pd.getSponsorTags();
            if (sponsorTags != null) {
                ArrayList A0i3 = AbstractC167007dF.A0i(sponsorTags);
                for (InterfaceC102194ip interfaceC102194ip : sponsorTags) {
                    if (interfaceC102194ip != null) {
                        treeUpdaterJNI = interfaceC102194ip.F7o();
                    } else {
                        treeUpdaterJNI = null;
                    }
                    A0i3.add(treeUpdaterJNI);
                }
                list = AbstractC001800i.A0X(A0i3);
            } else {
                list = null;
            }
            A1I.put("sponsor_tags", list);
        }
        if (interfaceC37961pd.C2c() != null) {
            A1I.put(AbstractC111324zv.A00(5428), interfaceC37961pd.C2c());
        }
        if (interfaceC37961pd.C41() != null) {
            A1I.put("sup_active", interfaceC37961pd.C41());
        }
        if (interfaceC37961pd.C9y() != null) {
            A1I.put(AbstractC111324zv.A00(546), interfaceC37961pd.C9y());
        }
        if (interfaceC37961pd.CCw() != null) {
            A1I.put("unseen_media_ids", interfaceC37961pd.CCw());
        }
        if (interfaceC37961pd.CDz() != null) {
            InterfaceC109844xC CDz = interfaceC37961pd.CDz();
            if (CDz != null) {
                treeUpdaterJNI9 = CDz.F7o();
            }
            A1I.put("user_pay_viewer_config", treeUpdaterJNI9);
        }
        if (interfaceC37961pd.CF6() != null) {
            A1I.put("video_duration", interfaceC37961pd.CF6());
        }
        if (interfaceC37961pd.CG4() != null) {
            A1I.put("viewer_count", interfaceC37961pd.CG4());
        }
        List CG6 = interfaceC37961pd.CG6();
        if (CG6 != null) {
            ArrayList A0i4 = AbstractC167007dF.A0i(CG6);
            Iterator it2 = CG6.iterator();
            while (it2.hasNext()) {
                AbstractC31178DnM.A1U(A0i4, it2);
            }
            A1I.put(AbstractC111324zv.A00(557), A0i4);
        }
        if (interfaceC37961pd.CGc() != null) {
            A1I.put("visibility", interfaceC37961pd.CGc());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
