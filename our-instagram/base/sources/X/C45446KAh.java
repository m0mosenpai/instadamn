package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig;
import com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchUseCase;
import com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.KAh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45446KAh extends AbstractC45465KBa implements InterfaceC189488aT, MSL, MQw {
    public static final String __redex_internal_original_name = "DirectThreadAvatarTrayFragment";
    public MQX A00;
    public IgdExpressionTrayHscrollLayout A01;
    public JoP A02;
    public EnumC46186KcO A03;
    public C7IK A04;
    public C47765L7l A0C;
    public String A0D;
    public final InterfaceC09390do A0Q = C50251MHg.A00(this, 33);
    public final InterfaceC09390do A0N = C50251MHg.A00(this, 29);
    public final InterfaceC09390do A0H = C50251MHg.A00(this, 20);
    public final InterfaceC09390do A0P = C50251MHg.A00(this, 32);
    public InterfaceC16660sJ A09 = C50138MCo.A00;
    public final InterfaceC09390do A0E = C50251MHg.A00(this, 16);
    public InterfaceC16820sZ A06 = new C50251MHg(this, 19);
    public final InterfaceC09390do A0G = C50251MHg.A00(this, 18);
    public final InterfaceC09390do A0L = C50251MHg.A00(this, 27);
    public InterfaceC16660sJ A0A = new MM0(this, 10);
    public C46721Kle A0B = new Object();
    public InterfaceC16820sZ A08 = new C50251MHg(this, 31);
    public final InterfaceC09390do A0O = C50251MHg.A00(this, 30);
    public InterfaceC16820sZ A07 = MFE.A00;
    public final InterfaceC09390do A0J = C50251MHg.A00(this, 26);
    public final InterfaceC09390do A0I = C50251MHg.A00(this, 25);
    public final InterfaceC09390do A0M = C50251MHg.A00(this, 28);
    public final InterfaceC09390do A0F = C50251MHg.A00(this, 17);
    public String A05 = "ig_direct_thread";
    public final InterfaceC09390do A0K = AbstractC60492pY.A02(this);
    public final boolean A0R = true;

    @Override // X.AbstractC45465KBa
    public final void A0H(QIw qIw, AbstractC46382Kg4 abstractC46382Kg4, AbstractC46386Kg8 abstractC46386Kg8, List list) {
        C14360o3.A0B(list, 0);
        super.A0H(qIw, abstractC46382Kg4, null, list);
        if (qIw != null) {
            L45 l45 = (L45) this.A0I.getValue();
            String A15 = AbstractC25225BEi.A15(this.A0J);
            C14360o3.A0B(A15, 0);
            if (!l45.A05) {
                LA9 la9 = l45.A00;
                int i = qIw.A01;
                int i2 = i / 45;
                if ((i ^ 45) < 0 && i2 * 45 != i) {
                    i2--;
                }
                int i3 = qIw.A02;
                int ceil = (int) Math.ceil(qIw.A03 / 45.0d);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(la9.A01, "avatar_stickers_measurement_avatar_sticker_tray_fetch");
                C0Zx c0Zx = new C0Zx();
                JQ0.A1A(c0Zx, i2 + 1, ceil);
                c0Zx.A05("result_size", AbstractC31171DnF.A0V(i3));
                if (A0f.isSampled()) {
                    AbstractC43593JPy.A1G(A0f, c0Zx, A15);
                    AbstractC43593JPy.A1I(A0f, "ranking");
                }
            }
        }
    }

    @Override // X.AbstractC45465KBa
    public final void A0L(List list) {
        String str;
        super.A0L(list);
        L45 l45 = (L45) this.A0I.getValue();
        String A15 = AbstractC25225BEi.A15(this.A0J);
        IgdsInlineSearchBox igdsInlineSearchBox = super.A0A;
        if (igdsInlineSearchBox == null || (str = igdsInlineSearchBox.getSearchString()) == null) {
            str = "";
        }
        int size = list.size();
        C14360o3.A0B(A15, 0);
        if (!l45.A05) {
            l45.A00.A04(A15, str, (String) l45.A04.invoke(), size);
        }
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.8f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.MSL
    public final void DjQ(String str) {
        String str2;
        IgdsInlineSearchBox igdsInlineSearchBox;
        C14360o3.A0B(str, 0);
        IgdsInlineSearchBox igdsInlineSearchBox2 = super.A0A;
        if (igdsInlineSearchBox2 == null || (str2 = igdsInlineSearchBox2.getSearchString()) == null) {
            str2 = "";
        }
        if (!str.equals(str2) && (igdsInlineSearchBox = super.A0A) != null) {
            igdsInlineSearchBox.A0E.setText(str);
        }
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.AbstractC45465KBa, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C7IK c7ik = this.A04;
        if (c7ik != null) {
            view.getBackground().setColorFilter(c7ik.A09, PorterDuff.Mode.SRC);
            IgdsInlineSearchBox igdsInlineSearchBox = super.A0A;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A05(c7ik.A0E);
            }
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = super.A0A;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.setHint(((DirectAvatarTrayFragmentConfig) this.A0Q.getValue()).A01);
        }
        if (super.A0L) {
            InterfaceC56392iX interfaceC56392iX = super.A07;
            if (interfaceC56392iX != null) {
                ImageView imageView = (ImageView) interfaceC56392iX.getView();
                C7IK c7ik2 = this.A04;
                if (c7ik2 != null) {
                    imageView.setColorFilter(C3DY.A00(AbstractC53242c7.A01(new ContextThemeWrapper(imageView.getContext(), c7ik2.A0E))));
                }
            } else {
                C14360o3.A0F("backButton");
                throw C00O.createAndThrow();
            }
        }
        if (((DirectAvatarTrayFragmentConfig) this.A0Q.getValue()).A02) {
            this.A0C = new C47765L7l(requireContext(), view);
        }
        if (AbstractC45465KBa.A05(this)) {
            ViewStub A0M = AbstractC167007dF.A0M(view, R.id.sticker_tray_hscroll_container);
            A0M.setLayoutResource(R.layout.direct_sticker_tray_hscroll_container);
            this.A01 = (IgdExpressionTrayHscrollLayout) AbstractC56372iV.A01(A0M, false, false).getView();
        }
    }

    @Override // X.AbstractC45465KBa
    public final AbstractC70653Fc A06() {
        UserSession userSession = ((C7FJ) this.A0E.getValue()).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36320223434907796L) && !C18U.A06(c06090Tz, userSession, 36328229254544737L)) {
            return super.A06();
        }
        return AbstractC46752Km9.A00(requireContext(), null, 1, false, true);
    }

    @Override // X.AbstractC45465KBa
    public final AbstractC46518KiH A0B() {
        String str;
        InterfaceC09390do interfaceC09390do = this.A0K;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        DirectThreadKey directThreadKey = (DirectThreadKey) this.A0P.getValue();
        if (directThreadKey != null) {
            str = directThreadKey.A00;
        } else {
            str = null;
        }
        C14360o3.A0B(A0r, 0);
        if ((str == null || str.length() == 0 || AbstractC46720Kld.A00(A0r, AbstractC43593JPy.A0f(str))) && C18U.A06(C06090Tz.A05, A0r, 36320871975232472L)) {
            return new AvatarLocalStickerSearchUseCase(A09(), AbstractC166987dD.A0r(interfaceC09390do));
        }
        return super.A0B();
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
        this.A04 = c7ik;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A0R;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A0D;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return AnonymousClass001.A0R(str, "direct_avatar_sticker_picker_grid");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0K);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        MQX mqx = this.A00;
        if (mqx == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        mqx.Dvf();
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        C47765L7l c47765L7l = this.A0C;
        if (c47765L7l != null) {
            c47765L7l.A00(i);
        }
        if (i == 0) {
            A0D();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC45465KBa
    public final void A0I(C66392zG c66392zG) {
        super.A0I(c66392zG);
        if (AbstractC45465KBa.A05(this)) {
            c66392zG.A01(new Object());
        }
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.8f;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return AbstractC110854yx.A05(A07());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1.A00, 36322190529931313L) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f8, code lost:
    
        if (r8 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ad, code lost:
    
        if (X.AbstractC46720Kld.A00(r9, X.AbstractC43593JPy.A0f(r4)) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ba, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9, 36320871975232472L) == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022e  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45446KAh.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC45465KBa, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-1514969645);
        L45 l45 = (L45) this.A0I.getValue();
        String A15 = AbstractC25225BEi.A15(this.A0J);
        IgdsInlineSearchBox igdsInlineSearchBox = super.A0A;
        if (igdsInlineSearchBox == null || (str = igdsInlineSearchBox.getSearchString()) == null) {
            str = "";
        }
        C14360o3.A0B(A15, 0);
        if (!l45.A05) {
            l45.A00.A03(A15, str);
        }
        super.onDestroyView();
        this.A01 = null;
        C0f9.A09(830100867, A02);
    }
}
