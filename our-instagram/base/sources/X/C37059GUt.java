package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.GUt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37059GUt extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37059GUt(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C37059GUt(obj, i));
    }

    public static C17050sx A01(Object obj, int i) {
        return AbstractC09440dt.A01(new C37059GUt(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC08830cm interfaceC08830cm;
        InterfaceC56392iX interfaceC56392iX;
        boolean z;
        switch (this.A00) {
            case 0:
                return Boolean.valueOf(AbstractC167007dF.A1X(C05F.A01, AbstractC31172DnG.A0f(((EME) this.A01).A0I).A03));
            case 1:
                z = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(((EME) this.A01).A0V), 36320902039938028L);
                return Boolean.valueOf(z);
            case 2:
                z = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(((EME) this.A01).A0V), 36320902040003565L);
                return Boolean.valueOf(z);
            case 3:
                return C3I7.A01(this.A01, false, true);
            case 4:
                z = AbstractC35085Fcw.A01(AbstractC166987dD.A0r(((EME) this.A01).A0V));
                return Boolean.valueOf(z);
            case 5:
                EME eme = (EME) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(eme.A0V);
                Context requireContext = eme.requireContext();
                C61972ry c61972ry = new C61972ry(eme.requireContext(), AbstractC018607g.A00(eme), null);
                C14360o3.A0B(A0r, 0);
                return AbstractC31674Dvf.A01(requireContext, null, A0r, c61972ry, null, null, "reshare", "forwarding_recipient_sheet", "forwarding_recipient_sheet", null, null, null, 0, 0, 0, 0, true, false, false, true, false, false, false, false, false, false);
            case 6:
                ViewGroup viewGroup = ((EME) this.A01).A03;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                return C0eB.A00;
            case 7:
                EME eme2 = (EME) this.A01;
                if (eme2.A09 != null) {
                    EME.A07(eme2, C37035GTr.A00, 0.0f, r0.intValue());
                }
                return AbstractC166997dE.A0a();
            case 8:
                EME eme3 = (EME) this.A01;
                if (eme3.A09 != null) {
                    EME.A07(eme3, C37035GTr.A00, 0.0f, r0.intValue());
                }
                return C0eB.A00;
            case 9:
                EMG emg = (EMG) this.A01;
                String str = emg.A0E;
                InterfaceC09390do interfaceC09390do = emg.A0M;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                FGB fgb = emg.A0C;
                FGA fga = emg.A0B;
                return new FQX(emg, A0r2, emg.A0A, fga, fgb, emg.A0D, AbstractC31172DnG.A0f(emg.A0G).A03, str, AbstractC167007dF.A1Z(emg.A0O), AbstractC35273Fh8.A09(AbstractC166987dD.A0r(interfaceC09390do), AbstractC25226BEj.A0z(emg.A0K), emg.requireArguments().getInt(AbstractC111324zv.A00(150))), AbstractC167007dF.A1Z(emg.A0H));
            case 10:
                return AbstractC153636vY.A00(AbstractC31179DnN.A04(this.A01), DirectCollectionArguments.class, "direct_collection_arguments");
            case 11:
                z = AbstractC31179DnN.A04(this.A01).getBoolean("DirectSaveToCollectionFragment_show_my_favs_upsell");
                return Boolean.valueOf(z);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                EMG emg2 = (EMG) this.A01;
                return new C34999FbW(AbstractC166987dD.A0r(emg2.A0M), AbstractC31172DnG.A0f(emg2.A0G), emg2);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return C1DW.A00(AbstractC166987dD.A0r(((EMG) this.A01).A0M));
            case 14:
                EMG emg3 = (EMG) this.A01;
                return ((C1DX) emg3.A0J.getValue()).A02(AbstractC31172DnG.A0f(emg3.A0G).A05);
            case Process.SIGTERM /* 15 */:
                return new GFI(this.A01, 0);
            case 16:
                return AbstractC61112qZ.A00(AbstractC31179DnN.A04(this.A01));
            case 17:
                z = AbstractC31179DnN.A04(this.A01).getBoolean("DirectSaveToCollectionFragment_show_pinned_save_row");
                return Boolean.valueOf(z);
            case 18:
                return this.A01;
            case Process.SIGSTOP /* 19 */:
                G4F g4f = (G4F) this.A01;
                return new C685336q(g4f.A01, AbstractC31171DnF.A0D("direct_thread_toggle"), g4f.A02);
            case 20:
                return new C7F3(((G4M) this.A01).A01);
            case 21:
                Object obj = this.A01;
                if (C206409Bx.A00(obj, 8)) {
                    return null;
                }
                if (obj instanceof C1575375n) {
                    if (AbstractC31171DnF.A1X(((C1575375n) obj).A03)) {
                        return null;
                    }
                    return Integer.valueOf(R.drawable.instagram_reels_pano_filled_24);
                }
                throw AbstractC166987dD.A14(AbstractC167017dG.A0n(obj, "Invalid messageContent: ", AbstractC166987dD.A1C()));
            case 22:
                return new C7F3(((G5C) this.A01).A01);
            case 23:
                return new FM1(((C49168Lol) this.A01).A05.getView());
            case 24:
                return new C34606FMp(((C49168Lol) this.A01).A06.getView());
            case 25:
                return this.A01.toString();
            case 26:
                KTD ktd = (KTD) this.A01;
                MessageIdentifier messageIdentifier = ktd.A01.A06;
                return new DirectMessageIdentifier(ktd.Ar9(), messageIdentifier.A01, messageIdentifier.A00());
            case 27:
                C163157Sa c163157Sa = (C163157Sa) this.A01;
                MessageIdentifier messageIdentifier2 = c163157Sa.A04.A06;
                return new DirectMessageIdentifier(c163157Sa.Ar9(), messageIdentifier2.A01, messageIdentifier2.A00());
            case 28:
                InterfaceC163557Ts interfaceC163557Ts = (InterfaceC163557Ts) this.A01;
                interfaceC163557Ts.Cyn();
                interfaceC163557Ts.D0d(null);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                L3U l3u = (L3U) this.A01;
                return AbstractC25225BEi.A0r(l3u.A00, l3u.A03);
            case 30:
                return new C47373KwO((C49083Ln9) this.A01);
            case 31:
                return new C7F3(((G4X) this.A01).A00);
            case 32:
                return AbstractC147806l5.A00(((G4X) this.A01).A00);
            case 33:
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View view = ((C49164Loh) this.A01).A02.getView();
                C14360o3.A0B(view, 1);
                return new C1574475a(view);
            case 34:
            case 35:
            default:
                return AbstractC166997dE.A0X((View) this.A01, R.id.doubletap_heart).getView();
            case 36:
                G4N g4n = (G4N) this.A01;
                return new C49072Lmy(g4n.A01, g4n.A03, g4n.A04, g4n.A08);
            case 37:
                interfaceC08830cm = ((G4N) this.A01).A09;
                return interfaceC08830cm.get();
            case 38:
                return AbstractC31172DnG.A0y(((G4N) this.A01).A0E);
            case 39:
                G4N g4n2 = (G4N) this.A01;
                return new C49074Ln0(g4n2.A01, g4n2.A03, g4n2.A04, g4n2.A05, g4n2.A06, g4n2.A08, g4n2.A0D, new C37059GUt(g4n2, 38));
            case 40:
                interfaceC08830cm = ((G4N) this.A01).A08;
                return interfaceC08830cm.get();
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC31172DnG.A0y(((G4N) this.A01).A0B);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC31172DnG.A0y(((G4N) this.A01).A0A);
            case 43:
                G4N g4n3 = (G4N) this.A01;
                return new G4V(g4n3.A00, g4n3.A01, g4n3.A02, g4n3.A03, g4n3.A07, new C37059GUt(g4n3, 40), new C37059GUt(g4n3, 41), new C37059GUt(g4n3, 42));
            case 44:
                LGr lGr = (LGr) this.A01;
                UserSession userSession = lGr.A01;
                if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36328714585587441L)) {
                    InterfaceC56392iX interfaceC56392iX2 = lGr.A0A;
                    AbstractC31172DnG.A1T(interfaceC56392iX2, 0);
                    return interfaceC56392iX2.getView();
                }
                InterfaceC56392iX interfaceC56392iX3 = lGr.A0B;
                AbstractC31172DnG.A1T(interfaceC56392iX3, 0);
                interfaceC56392iX3.getView();
                View requireViewById = lGr.A00.requireViewById(R.id.media);
                C14360o3.A0A(requireViewById);
                return requireViewById;
            case 45:
                LGr lGr2 = (LGr) this.A01;
                UserSession userSession2 = lGr2.A01;
                if (C18U.A06(AbstractC25225BEi.A0j(userSession2, 0), userSession2, 36328714585587441L)) {
                    interfaceC56392iX = lGr2.A0A;
                } else {
                    interfaceC56392iX = lGr2.A0B;
                }
                AbstractC31172DnG.A1T(interfaceC56392iX, 0);
                return interfaceC56392iX.getView();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                LGr lGr3 = (LGr) this.A01;
                lGr3.A0D.getView();
                return lGr3.A00.findViewById(R.id.profile_picture);
            case 47:
                C44785Js6 c44785Js6 = (C44785Js6) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View view2 = c44785Js6.A02.getView();
                C14360o3.A0B(view2, 1);
                return new C1574475a(view2);
            case 48:
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C44783Js4(((C44785Js6) this.A01).A03.getView());
            case 49:
                interfaceC08830cm = (InterfaceC08830cm) this.A01;
                return interfaceC08830cm.get();
        }
    }
}
