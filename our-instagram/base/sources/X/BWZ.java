package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class BWZ implements InterfaceC31062Dl4 {
    public InterfaceC16610sE A00;
    public InterfaceC16570sA A01;
    public final UserSession A02;
    public final C37522Gfe A03;
    public final C25361BKe A04;

    @Override // X.InterfaceC31062Dl4
    public final void CJO(C8JW c8jw, C26136BhN c26136BhN, InterfaceC88553xD interfaceC88553xD, String str, List list) {
        String str2;
        ClipsMidCardSubtype clipsMidCardSubtype;
        ClipsMidCardType clipsMidCardType;
        String A38;
        Long A0j;
        C8JW c8jw2 = c8jw;
        EnumC72417XdN enumC72417XdN = null;
        String A0j2 = AbstractC167017dG.A0j();
        InterfaceC16570sA interfaceC16570sA = this.A01;
        if (interfaceC16570sA != null) {
            interfaceC16570sA.invoke(interfaceC88553xD, list, null, c8jw2, c26136BhN, A0j2);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                break;
            }
            C38321qM c38321qM = ((C120985dq) it.next()).A02;
            if (c38321qM != null && (A38 = c38321qM.A38()) != null && (A0j = AbstractC166997dE.A0j(A38)) != null) {
                A1E.add(A0j);
            }
        }
        if (c26136BhN != null && (clipsMidCardType = c26136BhN.A04) != null) {
            enumC72417XdN = AbstractC28348Cf7.A01(C55214Oeb.A00(clipsMidCardType));
        }
        UserSession userSession = this.A02;
        C37522Gfe c37522Gfe = this.A03;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37522Gfe, userSession), AbstractC43591JPw.A00(81));
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1O(A0f, c37522Gfe.getModuleName());
            A0f.AAP("media_compound_key", ((C120985dq) AbstractC001800i.A0I(list)).getId());
            AbstractC25225BEi.A1M(EnumC39652Hih.A0F, A0f);
            String audioAssetId = interfaceC88553xD.getAudioAssetId();
            C14360o3.A0B(audioAssetId, 0);
            A0f.A9K("target_id", Long.valueOf(AbstractC167027dH.A03(audioAssetId)));
            A0f.AAP("media_tap_token", A0j2);
            A0f.AAk("media_list", A1E);
            A0f.A8R(enumC72417XdN, "midcard_type");
            if (c26136BhN != null && (clipsMidCardSubtype = c26136BhN.A03) != null) {
                str2 = clipsMidCardSubtype.toString();
            }
            A0f.AAP("midcard_subtype", str2);
            if (c8jw == null) {
                c8jw2 = C8JW.A0E;
            }
            A0f.A8R(c8jw2, "pivot_page_entry_point");
            AbstractC25232BEp.A1L(A0f, AbstractC111324zv.A00(71), A0j2);
        }
    }

    @Override // X.InterfaceC31062Dl4
    public final void CJN(C22P c22p, ClipsCameraCommandAction clipsCameraCommandAction, InterfaceC88553xD interfaceC88553xD) {
        InterfaceC16610sE interfaceC16610sE = this.A00;
        if (interfaceC16610sE != null) {
            interfaceC16610sE.invoke(interfaceC88553xD, c22p, clipsCameraCommandAction);
        }
    }

    @Override // X.InterfaceC31062Dl4
    public final void CKF(C26136BhN c26136BhN, InterfaceC88553xD interfaceC88553xD, List list, C05A c05a, boolean z) {
        String str;
        C25531Mh c25531Mh;
        ClipsMidCardSubtype clipsMidCardSubtype;
        ClipsMidCardSubtype clipsMidCardSubtype2;
        ClipsMidCardType clipsMidCardType;
        String A38;
        Long A0j;
        C25361BKe c25361BKe = this.A04;
        boolean z2 = !AbstractC166987dD.A1a(((C52678NSa) c25361BKe.A08.getValue()).A03(interfaceC88553xD.getAssetId(), false).getValue());
        EnumC72417XdN enumC72417XdN = null;
        AbstractC166987dD.A1Z(new PZO(interfaceC88553xD, c25361BKe, null, 35, z2), c25361BKe.A03());
        c05a.F8m(Boolean.valueOf(z2));
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            C38321qM c38321qM = ((C120985dq) it.next()).A02;
            if (c38321qM != null && (A38 = c38321qM.A38()) != null && (A0j = AbstractC166997dE.A0j(A38)) != null) {
                A1E.add(A0j);
            }
        }
        if (c26136BhN != null && (clipsMidCardType = c26136BhN.A04) != null) {
            enumC72417XdN = AbstractC28348Cf7.A01(C55214Oeb.A00(clipsMidCardType));
        }
        long j = 0;
        UserSession userSession = this.A02;
        C37522Gfe c37522Gfe = this.A03;
        C18920wW A01 = AbstractC12220kQ.A01(c37522Gfe, userSession);
        if (z2) {
            c25531Mh = new C25531Mh(AbstractC166987dD.A0f(A01, AbstractC111324zv.A00(2565)), DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
            if (AbstractC25226BEj.A1Z(c25531Mh)) {
                c25531Mh.A0R("containermodule", c37522Gfe.getModuleName());
                Long A0j2 = AbstractC25231BEo.A0j(0, interfaceC88553xD.getAssetId());
                if (A0j2 != null) {
                    j = A0j2.longValue();
                }
                c25531Mh.A0Q("container_id", Long.valueOf(j));
                c25531Mh.A0S("media_list", A1E);
                c25531Mh.A0M(enumC72417XdN, "midcard_type");
                if (c26136BhN != null && (clipsMidCardSubtype2 = c26136BhN.A03) != null) {
                    str = clipsMidCardSubtype2.toString();
                }
                c25531Mh.A0R("midcard_subtype", str);
                c25531Mh.A0M(I4Y.A00(interfaceC88553xD.Ae7()), "audio_type");
            } else {
                return;
            }
        } else {
            c25531Mh = new C25531Mh(AbstractC166987dD.A0f(A01, AbstractC111324zv.A00(2566)), 301);
            if (!AbstractC25226BEj.A1Z(c25531Mh)) {
                return;
            }
            c25531Mh.A0R("containermodule", c37522Gfe.getModuleName());
            Long A0j3 = AbstractC25231BEo.A0j(0, interfaceC88553xD.getAssetId());
            if (A0j3 != null) {
                j = A0j3.longValue();
            }
            c25531Mh.A0Q("container_id", Long.valueOf(j));
            c25531Mh.A0S("media_list", A1E);
            c25531Mh.A0M(enumC72417XdN, "midcard_type");
            if (c26136BhN != null && (clipsMidCardSubtype = c26136BhN.A03) != null) {
                str = clipsMidCardSubtype.toString();
            }
            c25531Mh.A0R("midcard_subtype", str);
        }
        c25531Mh.A0M(C8JW.A0E, "pivot_page_entry_point");
        c25531Mh.Cht();
    }

    public BWZ(UserSession userSession, C25361BKe c25361BKe, C37522Gfe c37522Gfe) {
        this.A03 = c37522Gfe;
        this.A02 = userSession;
        this.A04 = c25361BKe;
    }

    @Override // X.InterfaceC31062Dl4
    public final void EXC(InterfaceC16570sA interfaceC16570sA) {
        this.A01 = interfaceC16570sA;
    }

    @Override // X.InterfaceC31062Dl4
    public final void EXK(InterfaceC16610sE interfaceC16610sE) {
        this.A00 = interfaceC16610sE;
    }
}
