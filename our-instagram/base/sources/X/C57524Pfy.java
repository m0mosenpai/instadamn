package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.facebook.forker.Process;
import com.facebook.rtc.views.omnigrid.GridItemType;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;
import com.facebook.rtc.views.omnigridview.OmniGridView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* renamed from: X.Pfy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57524Pfy extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57524Pfy(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57524Pfy(obj, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context;
        int i;
        switch (this.A00) {
            case 0:
                return ((Context) this.A01).getDrawable(R.drawable.participant_muted_badge_drawable);
            case 1:
                return Integer.valueOf(AbstractC167017dG.A09((Context) this.A01));
            case 2:
                return Integer.valueOf(AbstractC167017dG.A0E((Context) this.A01));
            case 3:
                return ((Context) this.A01).getDrawable(R.drawable.instagram_microphone_off_outline_44);
            case 4:
                return Integer.valueOf(AbstractC167017dG.A06((Context) this.A01));
            case 5:
                return AbstractC37301Gc2.A0T(((Context) this.A01).getResources(), R.dimen.account_group_management_clickable_width);
            case 6:
                NXW nxw = (NXW) this.A01;
                nxw.A01 = true;
                C51681MsC c51681MsC = nxw.A00;
                if (c51681MsC != null) {
                    nxw.A06.invoke(Boolean.valueOf(AbstractC167007dF.A1X(c51681MsC.A03, GridItemType.SELF_VIEW)), EnumC53122NeZ.A02);
                }
                return C0eB.A00;
            case 7:
                return ((C52690NTb) this.A01).A05.getString(2131976633);
            case 8:
                return new C55629OnE((C52690NTb) this.A01);
            case 9:
                return new C55630OnF((C52690NTb) this.A01);
            case 10:
                return new O58((C52690NTb) this.A01);
            case 11:
                return Integer.valueOf(AbstractC166987dD.A0C(((C52690NTb) this.A01).A05, 16));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((C52690NTb) this.A01).A05.getString(2131976652);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return Integer.valueOf(AbstractC166987dD.A0C(((C52690NTb) this.A01).A05, 8));
            case 14:
                C52690NTb c52690NTb = (C52690NTb) this.A01;
                return new OX0(c52690NTb.A06, c52690NTb.A07, c52690NTb.A0C, AbstractC167027dH.A01(c52690NTb.A0J), AbstractC167027dH.A01(c52690NTb.A0M));
            case Process.SIGTERM /* 15 */:
                return ((C52690NTb) this.A01).A06.getResources().getString(2131954505);
            case 16:
                return new C54554O8g(((C52690NTb) this.A01).A09);
            case 17:
                return Boolean.valueOf(AbstractC167007dF.A1O((C18U.A01(C06090Tz.A05, ((C52690NTb) this.A01).A07, 36595891616024852L) > 1L ? 1 : (C18U.A01(C06090Tz.A05, ((C52690NTb) this.A01).A07, 36595891616024852L) == 1L ? 0 : -1))));
            case 18:
                C52690NTb c52690NTb2 = (C52690NTb) this.A01;
                int i2 = 2131972934;
                if (AbstractC25225BEi.A07(C06090Tz.A05, c52690NTb2.A07, 36595891616483606L) == 3) {
                    i2 = 2131972927;
                }
                return c52690NTb2.A06.getResources().getString(i2);
            case Process.SIGSTOP /* 19 */:
                return AbstractC23021Ah.A00(((C52690NTb) this.A01).A07);
            case 20:
                OUZ ouz = (OUZ) this.A01;
                View findViewById = AbstractC166987dD.A0d(ouz.A0B).findViewById(R.id.invite_page_back_button);
                C14360o3.A0A(findViewById);
                C52374NFq.A00(AbstractC166987dD.A0s(findViewById), ouz, 34);
                return findViewById;
            case 21:
                return ((View) this.A01).findViewById(R.id.bottom_sheet_contents);
            case 22:
                OUZ ouz2 = (OUZ) this.A01;
                RecyclerView recyclerView = (RecyclerView) AbstractC166987dD.A0c(AbstractC166987dD.A0d(ouz2.A0B), R.id.add_users_recycler_view);
                recyclerView.setItemAnimator(null);
                AbstractC31174DnI.A16(recyclerView.getContext(), recyclerView, 1, false);
                recyclerView.A0S = true;
                AbstractC37304Gc5.A10(recyclerView, ((C54792OJk) ouz2.A05.getValue()).A08);
                AbstractC008903d.A00(recyclerView, new C55541Olb(recyclerView, 4));
                recyclerView.requestApplyInsets();
                recyclerView.setFitsSystemWindows(true);
                return recyclerView;
            case 23:
                return AbstractC166987dD.A0d(((OUZ) this.A01).A0B).findViewById(R.id.invite_divider);
            case 24:
                return AbstractC166987dD.A0d(((OUZ) this.A01).A0B).findViewById(R.id.invite_title);
            case 25:
                OUZ ouz3 = (OUZ) this.A01;
                RecyclerView recyclerView2 = (RecyclerView) AbstractC166987dD.A0c(AbstractC166987dD.A0d(ouz3.A0B), R.id.participants_recycler_view);
                AbstractC31174DnI.A17(recyclerView2.getContext(), recyclerView2, false);
                AbstractC37304Gc5.A10(recyclerView2, ouz3.A09);
                recyclerView2.setHorizontalFadingEdgeEnabled(true);
                recyclerView2.setFadingEdgeLength(recyclerView2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
                recyclerView2.A0S = true;
                recyclerView2.setNestedScrollingEnabled(false);
                return recyclerView2;
            case 26:
                OUZ ouz4 = (OUZ) this.A01;
                return AbstractC31172DnG.A0A(LayoutInflater.from(ouz4.A02), MSW.A0B(ouz4.A04), R.layout.layout_call_participants_sheet);
            case 27:
                return AbstractC166987dD.A0d(((OUZ) this.A01).A0B).findViewById(R.id.sheet_subtitle);
            case 28:
                return AbstractC166987dD.A0d(((OUZ) this.A01).A0B).findViewById(R.id.sheet_title);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                NTI nti = (NTI) this.A01;
                context = nti.A00;
                i = 2131954510;
                if (C18U.A05(C06090Tz.A05, nti.A01)) {
                    i = 2131954509;
                    break;
                }
                break;
            case 30:
                NTI nti2 = (NTI) this.A01;
                context = nti2.A00;
                i = 2131954512;
                if (C18U.A05(C06090Tz.A05, nti2.A01)) {
                    i = 2131954513;
                    break;
                }
                break;
            case 31:
                PCK pck = (PCK) this.A01;
                View inflate = AbstractC25228BEl.A0P(pck.A02).inflate(R.layout.layout_call_participants_floating_view, (ViewGroup) null, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.common.draggableview.DraggableViewContainer");
                DraggableViewContainer draggableViewContainer = (DraggableViewContainer) inflate;
                draggableViewContainer.A0C = false;
                draggableViewContainer.A0E = true;
                draggableViewContainer.A0M.add(pck.A04);
                return draggableViewContainer;
            case 32:
                return AbstractC166997dE.A0S(((PCK) this.A01).A02, R.id.call_participant_grid_container);
            case 33:
                return AbstractC37301Gc2.A0T((Resources) ((PCK) this.A01).A0H.getValue(), R.dimen.achievements_list_container_height);
            case 34:
                return AbstractC37301Gc2.A0T((Resources) ((PCK) this.A01).A0H.getValue(), R.dimen.avatar_size_ridiculously_xxlarge);
            case 35:
                PCK pck2 = (PCK) this.A01;
                View requireViewById = AbstractC166987dD.A0d(pck2.A0B).requireViewById(R.id.call_participant_omni_grid);
                OmniGridView omniGridView = (OmniGridView) requireViewById;
                InterfaceC11380iw interfaceC11380iw = pck2.A06;
                InterfaceC16610sE interfaceC16610sE = pck2.A0O;
                O57 o57 = pck2.A08;
                InterfaceC16620sF interfaceC16620sF = pck2.A0N;
                omniGridView.setItemDefinitions(AbstractC25232BEp.A1F(2, new N0K(interfaceC11380iw, o57, interfaceC16620sF, interfaceC16610sE), AbstractC166987dD.A1L(AbstractC25227BEk.A0p(), new N0L(interfaceC11380iw, o57, pck2.A0M, pck2.A0L, interfaceC16620sF, interfaceC16610sE)), AbstractC166987dD.A1L(1, new N0K(interfaceC11380iw, o57, interfaceC16620sF, interfaceC16610sE))), null);
                C14360o3.A07(requireViewById);
                AbstractC13880nE.A0q(omniGridView, new PO9(pck2));
                omniGridView.setClipToOutline(true);
                omniGridView.setShouldInterceptChildTouchEventsForFloatingView(true);
                if (!pck2.A0P) {
                    return omniGridView;
                }
                InterfaceC57897Pm1 interfaceC57897Pm1 = pck2.A05;
                List list = omniGridView.A0H.A0M;
                list.add(interfaceC57897Pm1);
                if (!omniGridView.isAttachedToWindow()) {
                    list.remove(interfaceC57897Pm1);
                    return omniGridView;
                }
                omniGridView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC55359OiL(2, omniGridView, omniGridView, pck2));
                return omniGridView;
            case 36:
                return AbstractC167017dG.A0V(((PCK) this.A01).A0G);
            case 37:
                return AbstractC31179DnN.A0M(((PCK) this.A01).A02, R.id.call_participant_overlay_stub);
            case 38:
                return AbstractC25228BEl.A0M(((PCK) this.A01).A02);
            case 39:
                O58 o58 = ((PCK) this.A01).A09;
                if (o58 != null) {
                    return new Ox9(o58);
                }
                return null;
            case 40:
                C54728OFf c54728OFf = ((OX0) this.A01).A07;
                N0I A00 = N0I.A00(c54728OFf.A0D);
                int i3 = c54728OFf.A00;
                N0I A002 = N0I.A00(i3);
                N0I A003 = N0I.A00(i3);
                N0I A004 = N0I.A00(c54728OFf.A0A);
                N0I A005 = N0I.A00(c54728OFf.A0B);
                int i4 = c54728OFf.A06;
                N0I A006 = N0I.A00(i4);
                N0I A007 = N0I.A00(i4);
                N0I A008 = N0I.A00(c54728OFf.A09);
                Integer num = C05F.A01;
                return new C51744MtT(GridSelfViewLocation.TOP_RIGHT, (AbstractC53632Nnd) A004, (AbstractC53632Nnd) A005, (AbstractC53632Nnd) A00, (AbstractC53632Nnd) A002, (AbstractC53632Nnd) A006, (AbstractC53632Nnd) A007, (AbstractC53632Nnd) A003, (AbstractC53632Nnd) A008, (Object) new C51706Msb(null, Float.valueOf(0.8f), num, num, null, C05F.A00, null, 6, 0, 0, 0, false, false, false), true, true, false, false, false);
            case Seq.NULL_REFNUM /* 41 */:
                OX0 ox0 = (OX0) this.A01;
                int i5 = ox0.A07.A04;
                Integer num2 = C05F.A01;
                return C51744MtT.A01((C51744MtT) ox0.A08.getValue(), new C51706Msb(null, Float.valueOf(0.8f), num2, num2, null, C05F.A00, Integer.valueOf(i5), 6, 0, 0, 0, false, false, false));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                OX0 ox02 = (OX0) this.A01;
                C54728OFf c54728OFf2 = ox02.A07;
                N0I A009 = N0I.A00(c54728OFf2.A0A);
                N0I A0010 = N0I.A00(c54728OFf2.A0B);
                N0I A0011 = N0I.A00(c54728OFf2.A06);
                Integer A0Y = MSX.A0Y(AbstractC167007dF.A1Z(ox02.A0H) ? 1 : 0);
                Integer num3 = C05F.A0C;
                boolean z = false;
                boolean z2 = true;
                return new C51744MtT((GridSelfViewLocation) null, (AbstractC53632Nnd) A009, (AbstractC53632Nnd) A0010, (AbstractC53632Nnd) (null == true ? 1 : 0), (AbstractC53632Nnd) (null == true ? 1 : 0), (AbstractC53632Nnd) A0011, (AbstractC53632Nnd) (null == true ? 1 : 0), (AbstractC53632Nnd) (null == true ? 1 : 0), (AbstractC53632Nnd) (null == true ? 1 : 0), (Object) new C51706Msb(Float.valueOf(0.2f), null, A0Y, C05F.A01, null, num3, null, 6, 0, 0, 0, false, false, true), 15596, z2, z2, z, z);
            case 43:
                C54728OFf c54728OFf3 = ((OX0) this.A01).A07;
                N0I A0012 = N0I.A00(c54728OFf3.A00);
                int i6 = c54728OFf3.A0C;
                boolean z3 = false;
                AbstractC53632Nnd abstractC53632Nnd = null;
                return new C51744MtT(GridSelfViewLocation.BOTTOM_RIGHT, abstractC53632Nnd, abstractC53632Nnd, N0I.A00(0), N0I.A00(0), N0I.A00(i6), N0I.A00(i6), A0012, N0I.A00(c54728OFf3.A09), abstractC53632Nnd, 22275, z3, z3, z3, z3);
            case 44:
                C54728OFf c54728OFf4 = ((OX0) this.A01).A07;
                N0I A0013 = N0I.A00(c54728OFf4.A0D);
                int i7 = c54728OFf4.A00;
                N0I A0014 = N0I.A00(i7);
                N0I A0015 = N0I.A00(i7);
                N0I A0016 = N0I.A00(c54728OFf4.A0A);
                N0I A0017 = N0I.A00(c54728OFf4.A0B);
                int i8 = c54728OFf4.A01;
                N0I A0018 = N0I.A00(i8);
                N0I A0019 = N0I.A00(i8);
                N0I A0020 = N0I.A00(c54728OFf4.A09);
                Integer num4 = C05F.A01;
                return new C51744MtT(GridSelfViewLocation.TOP_RIGHT, (AbstractC53632Nnd) A0016, (AbstractC53632Nnd) A0017, (AbstractC53632Nnd) A0013, (AbstractC53632Nnd) A0014, (AbstractC53632Nnd) A0018, (AbstractC53632Nnd) A0019, (AbstractC53632Nnd) A0015, (AbstractC53632Nnd) A0020, (Object) new C51706Msb(null, null, num4, num4, Integer.valueOf(c54728OFf4.A02), num4, null, 6, 0, 0, 0, false, false, false), true, true, false, false, false);
            case 45:
                C54728OFf c54728OFf5 = ((OX0) this.A01).A07;
                N0I A0021 = N0I.A00(c54728OFf5.A00);
                int i9 = c54728OFf5.A0C;
                AbstractC53632Nnd abstractC53632Nnd2 = null;
                boolean z4 = false;
                return new C51744MtT(GridSelfViewLocation.BOTTOM_RIGHT, abstractC53632Nnd2, abstractC53632Nnd2, abstractC53632Nnd2, abstractC53632Nnd2, (AbstractC53632Nnd) N0I.A00(i9), (AbstractC53632Nnd) N0I.A00(i9), (AbstractC53632Nnd) A0021, (AbstractC53632Nnd) N0I.A00(c54728OFf5.A09), (Object) abstractC53632Nnd2, 21263, z4, z4, true, z4);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C55720Oom c55720Oom = (C55720Oom) this.A01;
                c55720Oom.A07 = true;
                InterfaceC09390do interfaceC09390do = c55720Oom.A0A;
                C50781Mbo c50781Mbo = new C50781Mbo(AbstractC166997dE.A0L(AbstractC166987dD.A0d(interfaceC09390do)), c55720Oom);
                MSW.A0B(interfaceC09390do).addView(c50781Mbo, -1, -1);
                return c50781Mbo;
            case 47:
                FrameLayout frameLayout = new FrameLayout((Context) this.A01);
                frameLayout.setBackgroundColor(-16777216);
                MSZ.A13(frameLayout);
                return frameLayout;
            case 48:
                return AbstractC166997dE.A0S(AbstractC166987dD.A0d(((NTX) this.A01).A0G.A0B), R.id.medium_countdown_keyframe_view);
            default:
                return C68U.A00(((NTX) this.A01).A0A, R.raw.countdown_3s_round_style);
        }
        return context.getString(i);
    }
}
