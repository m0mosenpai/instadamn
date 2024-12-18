package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PgK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57546PgK extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57546PgK(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57546PgK(obj, i));
    }

    public static C17050sx A01(Object obj, int i) {
        return AbstractC09440dt.A01(new C57546PgK(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C54985OTt c54985OTt;
        InterfaceC09390do interfaceC09390do;
        InterfaceC58279PsX interfaceC58279PsX;
        Integer num;
        View view;
        int i;
        InterfaceC09390do interfaceC09390do2;
        N74 n74;
        switch (this.A00) {
            case 0:
                N74 n742 = (N74) this.A01;
                C51053Mh7 A0l = MSW.A0l(n742.A0D);
                AbstractC12990ll A0o = AbstractC166987dD.A0o(n742.A09);
                if (C18U.A06(AbstractC25225BEi.A0j(A0o, 0), A0o, 36314365099510297L)) {
                    c54985OTt = C54985OTt.A04;
                } else {
                    c54985OTt = C54985OTt.A03;
                }
                C14360o3.A0B(c54985OTt, 0);
                C51053Mh7.A01(new P5R(c54985OTt), A0l);
                InterfaceC16820sZ interfaceC16820sZ = n742.A01;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                return C0eB.A00;
            case 1:
                N74 n743 = (N74) this.A01;
                AbstractC55033OXz.A01(n743, C05F.A0o);
                C57546PgK c57546PgK = new C57546PgK(n743, 0);
                C14360o3.A0B(n743, 0);
                C3DN A0m = AbstractC25230BEn.A0m(n743);
                if (A0m != null) {
                    ((C3DP) A0m).A0H = new C56768PHl(C57535Pg9.A00(c57546PgK, n743, 21));
                    A0m.A0B();
                }
                return C0eB.A00;
            case 2:
            case Process.SIGSTOP /* 19 */:
            case 27:
            case 31:
            case Seq.NULL_REFNUM /* 41 */:
            default:
                return AbstractC25235BEs.A0U(this.A01);
            case 3:
                N74 n744 = (N74) this.A01;
                interfaceC09390do = n744.A09;
                n74 = n744;
                return new NCV(n74, AbstractC166987dD.A0r(interfaceC09390do));
            case 4:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 5:
                interfaceC58279PsX = ((C52349NEn) this.A01).A02;
                num = C05F.A04;
                AbstractC55033OXz.A01(interfaceC58279PsX, num);
                return C0eB.A00;
            case 6:
                C51319Mlg c51319Mlg = (C51319Mlg) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                view = c51319Mlg.A00;
                i = R.id.mk_section_type_description;
                return AbstractC166997dE.A0S(view, i);
            case 7:
                C51319Mlg c51319Mlg2 = (C51319Mlg) this.A01;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return AbstractC166997dE.A0S(c51319Mlg2.A00, R.id.mk_section_type_item);
            case 8:
                C51319Mlg c51319Mlg3 = (C51319Mlg) this.A01;
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                view = c51319Mlg3.A00;
                i = R.id.mk_section_type_name;
                return AbstractC166997dE.A0S(view, i);
            case 9:
                interfaceC09390do2 = ((N73) this.A01).A06;
                return Nv6.A00(AbstractC166987dD.A0r(interfaceC09390do2));
            case 10:
                int i5 = AbstractC31179DnN.A04(this.A01).getInt("mk_select_tab_type");
                for (Ng1 ng1 : Ng1.values()) {
                    if (ng1.A00 == i5) {
                        return ng1;
                    }
                }
                throw AbstractC166987dD.A12("Invalid type for MediaKit tab");
            case 11:
                Fragment fragment = ((Fragment) this.A01).mParentFragment;
                C14360o3.A0C(fragment, "null cannot be cast to non-null type com.instagram.mediakit.ui.fragment.MediaKitMediaPickerTabFragment");
                return ((N5W) fragment).A0B.getValue();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C56034Ou6.A00(this.A01, 19);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                interfaceC09390do2 = ((N6U) this.A01).A0N;
                return Nv6.A00(AbstractC166987dD.A0r(interfaceC09390do2));
            case 14:
                N6U n6u = (N6U) this.A01;
                C189448aO A00 = N6U.A00(n6u);
                A00.A0B = R.color.fds_transparent;
                A00.A00().A02(n6u.requireActivity(), new N4J());
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                N6U n6u2 = (N6U) this.A01;
                interfaceC09390do = n6u2.A0N;
                n74 = n6u2;
                return new NCV(n74, AbstractC166987dD.A0r(interfaceC09390do));
            case 16:
            case 18:
                ((N6U) this.A01).A08 = null;
                return C0eB.A00;
            case 17:
                N6U n6u3 = (N6U) this.A01;
                AbstractC55033OXz.A01(n6u3, C05F.A0X);
                AbstractC25227BEk.A1B(n6u3);
                return C0eB.A00;
            case 20:
                return ((N6U) this.A01).A0F.invoke();
            case 21:
                N73 n73 = (N73) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(n73.A06);
                Ng1 ng12 = (Ng1) n73.A04.getValue();
                InterfaceC09390do interfaceC09390do3 = n73.A05;
                InterfaceC15070pN interfaceC15070pN = ((C51052Mh6) interfaceC09390do3.getValue()).A06;
                Context requireContext = n73.requireContext();
                C08790ch A002 = AbstractC018607g.A00(n73);
                C0eR c0eR = n73.mLifecycleRegistry;
                C14360o3.A07(c0eR);
                C51052Mh6 c51052Mh6 = (C51052Mh6) interfaceC09390do3.getValue();
                boolean z = true;
                if (C51052Mh6.A00(c51052Mh6.A02, c51052Mh6) <= 1) {
                    z = false;
                }
                return new C52319NDi(requireContext, c0eR, A002, A0r, ng12, interfaceC15070pN, z);
            case 22:
            case 34:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 48:
                return this.A01;
            case 23:
            case 35:
            case 43:
            case 49:
                return AbstractC25226BEj.A1C(this.A01);
            case 24:
            case 36:
            case 44:
                return AbstractC167027dH.A0B(this.A01);
            case 25:
                interfaceC58279PsX = (C52157N6j) this.A01;
                num = C05F.A03;
                AbstractC55033OXz.A01(interfaceC58279PsX, num);
                return C0eB.A00;
            case 26:
                interfaceC09390do2 = ((C52157N6j) this.A01).A0D;
                return Nv6.A00(AbstractC166987dD.A0r(interfaceC09390do2));
            case 28:
                C52157N6j c52157N6j = (C52157N6j) this.A01;
                interfaceC09390do = c52157N6j.A0D;
                n74 = c52157N6j;
                return new NCV(n74, AbstractC166987dD.A0r(interfaceC09390do));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                Fragment fragment2 = ((Fragment) this.A01).mParentFragment;
                C14360o3.A0C(fragment2, "null cannot be cast to non-null type com.instagram.mediakit.ui.fragment.MediaKitFragment");
                C47785L8p c47785L8p = ((N6U) fragment2).A0D;
                if (c47785L8p != null) {
                    return c47785L8p;
                }
                C14360o3.A0F("mediaKitViewPointHelper");
                throw C00O.createAndThrow();
            case 30:
                interfaceC09390do2 = ((N71) this.A01).A06;
                return Nv6.A00(AbstractC166987dD.A0r(interfaceC09390do2));
            case 32:
                N71 n71 = (N71) this.A01;
                interfaceC09390do = n71.A06;
                n74 = n71;
                return new NCV(n74, AbstractC166987dD.A0r(interfaceC09390do));
            case 33:
                N73 n732 = (N73) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(n732.A06);
                Ng1 ng13 = (Ng1) n732.A04.getValue();
                InterfaceC09390do interfaceC09390do4 = n732.A05;
                InterfaceC15070pN interfaceC15070pN2 = ((C51052Mh6) interfaceC09390do4.getValue()).A06;
                C51052Mh6 c51052Mh62 = (C51052Mh6) interfaceC09390do4.getValue();
                boolean z2 = true;
                if (C51052Mh6.A00(c51052Mh62.A02, c51052Mh62) <= 1) {
                    z2 = false;
                }
                return new ND8(A0r2, ng13, interfaceC15070pN2, z2);
            case 37:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C1UC A0C = AbstractC31172DnG.A0C(this.A01);
                C14360o3.A0C(A0C, AbstractC43591JPw.A00(21));
                return ((C2d4) A0C).AYT();
            case 38:
                int i6 = AbstractC31179DnN.A04(this.A01).getInt("mk_select_entry_point");
                for (EnumC53194Nfq enumC53194Nfq : EnumC53194Nfq.values()) {
                    if (enumC53194Nfq.A00 == i6) {
                        return enumC53194Nfq;
                    }
                }
                throw AbstractC166987dD.A12("Invalid entrypoint for MediaKit Media selection");
            case 39:
                interfaceC09390do2 = ((N5W) this.A01).A0A;
                return Nv6.A00(AbstractC166987dD.A0r(interfaceC09390do2));
            case 40:
                N5W n5w = (N5W) this.A01;
                interfaceC09390do = n5w.A0A;
                n74 = n5w;
                return new NCV(n74, AbstractC166987dD.A0r(interfaceC09390do));
            case 45:
                N5W n5w2 = (N5W) this.A01;
                return new NCU(n5w2, AbstractC166987dD.A0r(n5w2.A0A), (EnumC53194Nfq) n5w2.A08.getValue());
            case 47:
                interfaceC09390do2 = ((C52733NUw) this.A01).A02;
                return Nv6.A00(AbstractC166987dD.A0r(interfaceC09390do2));
        }
    }
}
