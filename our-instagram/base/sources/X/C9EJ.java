package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import go.Seq;
import java.util.List;

/* renamed from: X.9EJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9EJ extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9EJ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC86513tO interfaceC86513tO;
        C86503tN c86503tN;
        List list;
        InterfaceC86513tO interfaceC86513tO2;
        C86503tN c86503tN2;
        List list2;
        View view;
        int i;
        AbstractC80633is abstractC80633is;
        switch (this.A00) {
            case 0:
                return new C80113i0(((C79293ga) this.A01).A00);
            case 1:
                return new C76173bM(((C79293ga) this.A01).A00);
            case 2:
                return new C86473tK(((C79293ga) this.A01).A00);
            case 3:
                C86493tM c86493tM = (C86493tM) this.A01;
                Object obj = null;
                if (c86493tM != null) {
                    interfaceC86513tO = c86493tM.A01;
                } else {
                    interfaceC86513tO = null;
                }
                if ((interfaceC86513tO instanceof C86503tN) && (c86503tN = (C86503tN) interfaceC86513tO) != null && (list = c86503tN.A00) != null) {
                    obj = AbstractC001800i.A0J(list);
                }
                return Boolean.valueOf(obj instanceof SocialContextBubbleUiState);
            case 4:
                C86493tM c86493tM2 = (C86493tM) this.A01;
                if (c86493tM2 != null) {
                    interfaceC86513tO2 = c86493tM2.A01;
                } else {
                    interfaceC86513tO2 = null;
                }
                if (interfaceC86513tO2 instanceof C86503tN) {
                    c86503tN2 = (C86503tN) interfaceC86513tO2;
                } else {
                    c86503tN2 = null;
                }
                boolean z = false;
                if (c86503tN2 != null && (list2 = c86503tN2.A00) != null && list2.size() > 1 && (AbstractC001800i.A0J(list2) instanceof SocialContextBubbleUiState)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return ((C79293ga) this.A01).A01.BRj();
            case 6:
                return ((C79293ga) this.A01).A01.BRk();
            case 7:
                return new C41G(((C79293ga) this.A01).A00);
            case 8:
                return new C86453tI(((C79293ga) this.A01).A00);
            case 9:
                return new C79373gj(((C79293ga) this.A01).A00);
            case 10:
                return new C41G(((C906241x) this.A01).A00);
            case 11:
                return new C79373gj(((C906241x) this.A01).A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C80463ib c80463ib = (C80463ib) this.A01;
                if (c80463ib != null) {
                    AbstractC80633is abstractC80633is2 = c80463ib.A01;
                    if (!(abstractC80633is2 instanceof HLV) && !(abstractC80633is2 instanceof C80623ir)) {
                        String A00 = AbstractC111324zv.A00(2898);
                        String str = c80463ib.A03;
                        String str2 = c80463ib.A04;
                        String A0i = AnonymousClass001.A0i(A00, str, str2, '|');
                        C1OG A0J = C25821No.A00().A0J(c80463ib.A02, str2);
                        A0J.A0I = false;
                        A0J.A0J = true;
                        A0J.A02(new C23596Acq(c80463ib, 5));
                        A0J.A08 = A0i;
                        InterfaceC59502nt A002 = A0J.A00();
                        c80463ib.A00 = A002;
                        A002.E7X();
                    }
                }
                return new C79353gg(new J7S(c80463ib, 46));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C80463ib c80463ib2 = (C80463ib) this.A01;
                if (c80463ib2 != null) {
                    abstractC80633is = c80463ib2.A01;
                } else {
                    abstractC80633is = null;
                }
                if (!(abstractC80633is instanceof C80623ir)) {
                    return null;
                }
                return abstractC80633is;
            case 14:
                Context context = ((C76223bS) this.A01).A05.A0C;
                C14360o3.A07(context);
                return context.getDrawable(R.drawable.feed_like_big);
            case Process.SIGTERM /* 15 */:
                int A01 = AbstractC13890nF.A01(((C76083bD) this.A01).A00);
                int i2 = AbstractC75953b0.A00;
                return Integer.valueOf(View.MeasureSpec.makeMeasureSpec(A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            case 16:
                ((C80093hy) this.A01).A02.A0A.A01 = null;
                return C0eB.A00;
            case 17:
                return new C80333iN(((Boolean) ((C80093hy) this.A01).A01.A0A.A00.invoke()).booleanValue());
            case 18:
                return ((C80333iN) this.A01).A01;
            case Process.SIGSTOP /* 19 */:
                C107384sj c107384sj = (C107384sj) this.A01;
                return new C86773tp(c107384sj.A04, c107384sj.A02);
            case 20:
                return new C86763to(((C107384sj) this.A01).A02);
            case 21:
                return ((ViewStub) this.A01).inflate();
            case 22:
                C86083sf c86083sf = (C86083sf) this.A01;
                Object value = c86083sf.A01.getValue();
                C14360o3.A07(value);
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) ((View) value).findViewById(R.id.hint_icon);
                slideInAndOutIconView.setIconColor(c86083sf.A00.getColor(R.color.audio_bar_action_color_enabled));
                slideInAndOutIconView.A0B.setPadding(48, 48, 48, 48);
                return slideInAndOutIconView;
            case 23:
                ((InterfaceC86743tm) this.A01).D4E();
                return C0eB.A00;
            case 24:
                InterfaceC56392iX interfaceC56392iX = ((C86033sa) this.A01).A00;
                if (interfaceC56392iX == null) {
                    C14360o3.A0F("stubHolder");
                    throw C00O.createAndThrow();
                }
                return interfaceC56392iX.getView();
            case 25:
                return ((View) ((C86033sa) this.A01).A01.getValue()).getResources().getDrawable(R.drawable.feed_attached_scrubber_progress_inactive_drawable, null);
            case 26:
                view = (View) ((C86033sa) this.A01).A01.getValue();
                i = R.id.scrubber;
                View requireViewById = view.requireViewById(i);
                C14360o3.A07(requireViewById);
                return requireViewById;
            case 27:
                return ((View) ((C86033sa) this.A01).A01.getValue()).getResources().getDrawable(R.drawable.feed_attached_scrubber_progress_active_drawable, null);
            case 28:
                view = (View) ((C86033sa) this.A01).A01.getValue();
                i = R.id.scrubber_preview_thumbnail_view;
                View requireViewById2 = view.requireViewById(i);
                C14360o3.A07(requireViewById2);
                return requireViewById2;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                view = (View) ((C86033sa) this.A01).A01.getValue();
                i = R.id.thumbnail_legibility_gradient;
                View requireViewById22 = view.requireViewById(i);
                C14360o3.A07(requireViewById22);
                return requireViewById22;
            case 30:
                return ((InterfaceC60682pr) this.A01).getScrollingViewProxy();
            case 31:
                ((C39D) this.A01).AIN();
                return C0eB.A00;
            case 32:
                ((C39D) this.A01).Co3();
                return C0eB.A00;
            case 33:
                return Boolean.valueOf(((C39D) this.A01).CQs());
            case 34:
                return ((C39D) this.A01).B34();
            case 35:
                return ((C39D) this.A01).B8W();
            case 36:
                ((C39D) this.A01).ATf();
                return C0eB.A00;
            case 37:
                ((C39D) this.A01).ATo();
                return C0eB.A00;
            case 38:
                return ((C39C) this.A01).A05.requireActivity();
            case 39:
                return new C85523rh((UserSession) this.A01);
            case 40:
                return new C65502xm((UserSession) this.A01);
            case Seq.NULL_REFNUM /* 41 */:
                return Integer.valueOf((int) C18U.A01(C06090Tz.A05, ((C65502xm) this.A01).A02, 36598679051177222L));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                UserSession userSession = ((C65502xm) this.A01).A02;
                C06090Tz c06090Tz = C06090Tz.A05;
                return Integer.valueOf(Math.min((int) C18U.A01(c06090Tz, userSession, 36604803673691260L), (int) C18U.A01(c06090Tz, userSession, 36598679050849541L)));
            case 43:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C65502xm) this.A01).A02, 36317204076499857L));
            case 44:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C65502xm) this.A01).A02, 36317204075254663L));
            case 45:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C33Y) this.A01).A03, 36325811187561867L));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return Long.valueOf(C18U.A01(C06090Tz.A05, ((C33Y) this.A01).A03, 36607286164133450L));
            case 47:
                C33P c33p = (C33P) this.A01;
                int i3 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                return Boolean.valueOf(C4QO.A00(c33p.A0A));
            case 48:
                return new C62722tB((UserSession) this.A01);
            default:
                return C42V.A00((UserSession) this.A01);
        }
    }
}
