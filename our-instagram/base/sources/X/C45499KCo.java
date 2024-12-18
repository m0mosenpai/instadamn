package X;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KCo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45499KCo extends AbstractC59962oe implements InterfaceC50436MOq, MQw {
    public static final String __redex_internal_original_name = "DirectStickerTabPickerFragment";
    public int A00;
    public Bundle A01;
    public ViewGroup A03;
    public Fragment A04;
    public UserSession A05;
    public C7FJ A06;
    public C47326Kvb A07;
    public EnumC46186KcO A08;
    public C47748L6s A09;
    public IgdsInlineSearchBox A0A;
    public DirectThreadKey A0B;
    public MSU A0C;
    public C47781L8h A0D;
    public Boolean A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public TouchInterceptorFrameLayout A0W;
    public C47300KvB A0X;
    public C47550KzK A0Y;
    public C7IK A0Z;
    public boolean A0a;
    public boolean A0b;
    public final AnonymousClass987 A0d = new AnonymousClass987();
    public View.OnTouchListener A02 = new ViewOnTouchListenerC48084LQj(this, 12);
    public final InterfaceC159877Ez A0c = new C48702LgW(this);

    @Override // X.MQw
    public final void DOM() {
        this.A00 = 0;
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null) {
            viewGroup.setTranslationY(0.0f);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_sticker_tab_picker_fragment";
    }

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return true;
    }

    private C49639LwW A00(List list) {
        if (this.A0a) {
            boolean A1X = AbstractC31178DnM.A1X(C06090Tz.A05, this.A05, 36322409573263579L);
            int i = R.drawable.instagram_avatar_selector;
            if (A1X) {
                i = R.drawable.instagram_avatar_selector_new;
            }
            C49639LwW c49639LwW = new C49639LwW("avatar_stickers", new M8T(this, 4), i, 2131958750);
            list.add(c49639LwW);
            return c49639LwW;
        }
        return null;
    }

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
        this.A0Z = c7ik;
        if (this.mView != null) {
            ViewGroup viewGroup = this.A03;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(c7ik.A09);
                C47781L8h c47781L8h = this.A0D;
                int i = c7ik.A0C;
                Iterator it = c47781L8h.A01.A04.iterator();
                while (it.hasNext()) {
                    ((L0P) it.next()).A00.setImageTintList(ColorStateList.valueOf(i));
                }
            }
            IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
            igdsInlineSearchBox.getClass();
            igdsInlineSearchBox.A05(c7ik.A0E);
            InterfaceC08430c6 A00 = C49639LwW.A00(this);
            C7IK c7ik2 = this.A0Z;
            if ((A00 instanceof InterfaceC50436MOq) && c7ik2 != null) {
                ((InterfaceC50436MOq) A00).ADq(c7ik2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // X.MQw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DON(int r5) {
        /*
            r4 = this;
            r4.A00 = r5
            android.view.ViewGroup r1 = r4.A03
            if (r1 == 0) goto Lb
            int r0 = -r5
            float r0 = (float) r0
            r1.setTranslationY(r0)
        Lb:
            X.MSU r0 = r4.A0C
            if (r0 == 0) goto L76
            X.LwW r0 = (X.C49639LwW) r0
            java.lang.String r2 = r0.A02
            int r1 = r2.hashCode()
            r0 = -1735392516(0xffffffff989002fc, float:-3.722614E-24)
            if (r1 == r0) goto L6b
            r0 = 3172655(0x30692f, float:4.445837E-39)
            if (r1 == r0) goto L60
            r0 = 1531715286(0x5b4c1ed6, float:5.74548E16)
            if (r1 != r0) goto L76
            java.lang.String r0 = "stickers"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L76
            java.lang.Integer r3 = X.C05F.A01
        L30:
            X.KvB r1 = r4.A0X
            com.instagram.model.direct.DirectThreadKey r0 = r4.A0B
            java.lang.String r2 = X.AbstractC43827JZq.A01(r0)
            X.0wW r1 = r1.A00
            java.lang.String r0 = "direct_composer_tap_search_field"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L57
            X.AbstractC31171DnF.A1H(r1, r2)
            if (r3 == 0) goto L5e
            int r0 = r3.intValue()
            switch(r0) {
                case 1: goto L58;
                case 2: goto L5b;
                default: goto L52;
            }
        L52:
            java.lang.String r0 = "avatar"
        L54:
            X.AbstractC31175DnJ.A17(r1, r0)
        L57:
            return
        L58:
            java.lang.String r0 = "sticker"
            goto L54
        L5b:
            java.lang.String r0 = "gif"
            goto L54
        L5e:
            r0 = 0
            goto L54
        L60:
            java.lang.String r0 = "gifs"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L76
            java.lang.Integer r3 = X.C05F.A0C
            goto L30
        L6b:
            java.lang.String r0 = "avatar_stickers"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L76
            java.lang.Integer r3 = X.C05F.A00
            goto L30
        L76:
            r3 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45499KCo.DON(int):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        String str = fragment.mTag;
        if ("gifs".equals(str)) {
            InterfaceC159877Ez interfaceC159877Ez = this.A0c;
            C14360o3.A0B(interfaceC159877Ez, 0);
            ((C45497KCm) fragment).A00 = interfaceC159877Ez;
        } else {
            if (!"stickers".equals(str) && !"recents".equals(str)) {
                return;
            }
            ((KCR) fragment).A00 = new C47933LFf(this);
        }
    }

    @Override // X.MQw
    public final void onBottomSheetPositionChanged(int i, int i2) {
        AbstractC43594JPz.A17(this.A03, i, i2);
        InterfaceC08430c6 A00 = C49639LwW.A00(this);
        if (A00 instanceof InterfaceC189488aT) {
            ((InterfaceC189488aT) A00).onBottomSheetPositionChanged(i, i2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r3, 0), r3, 36317706585773551L) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C45499KCo r5, java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r4 = 0
            switch(r0) {
                case -1735392516: goto L5d;
                case 3172655: goto L44;
                case 1531715286: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.String r1 = "direct_sticker_tab_picker_fragment"
            java.lang.String r0 = "Unhandled tab for search hint"
            X.C0w9.A03(r1, r0)
            return
        L10:
            java.lang.String r0 = "stickers"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8
            boolean r0 = r5.A0J
            if (r0 == 0) goto L30
            com.instagram.common.session.UserSession r3 = r5.A05
            X.0Tz r2 = X.AbstractC25225BEi.A0j(r3, r4)
            r0 = 36317706585773551(0x8106c3001a15ef, double:3.030802112285047E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 2131960413(0x7f13225d, float:1.9557494E38)
            if (r0 == 0) goto L33
        L30:
            r1 = 2131960409(0x7f132259, float:1.9557486E38)
        L33:
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r5.A0A
            r0.getClass()
            r0.setVisibility(r4)
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r5.A0A
            r0.getClass()
            r0.setHint(r1)
            return
        L44:
            java.lang.String r0 = "gifs"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r5.A0A
            r0.getClass()
            r0.setVisibility(r4)
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r5.A0A
            r1.getClass()
            r0 = 2131960408(0x7f132258, float:1.9557484E38)
            goto L77
        L5d:
            java.lang.String r0 = "avatar_stickers"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r5.A0A
            r1.getClass()
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r5.A0A
            r1.getClass()
            r0 = 2131960404(0x7f132254, float:1.9557476E38)
        L77:
            r1.setHint(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45499KCo.A01(X.KCo, java.lang.String):void");
    }

    @Override // X.MQw
    public final boolean isScrolledToTop() {
        InterfaceC08430c6 A00 = C49639LwW.A00(this);
        if (A00 instanceof MSL) {
            return ((MSL) A00).isScrolledToTop();
        }
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment A00 = C49639LwW.A00(this);
        if (A00 != null) {
            A00.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(259344042);
        super.onCreate(bundle);
        this.A01 = requireArguments();
        this.A05 = AbstractC31176DnK.A0S(this);
        this.A0V = this.A01.getBoolean("param_extra_show_like_sticker");
        this.A0K = this.A01.getBoolean("param_extra_is_broadcast_thread");
        this.A0R = this.A01.getBoolean("param_extra_is_poll_creation_enabled");
        this.A0M = this.A01.getBoolean("param_extra_gif_enabled");
        this.A0T = this.A01.getBoolean("param_extra_sticker_enabled");
        this.A0a = this.A01.getBoolean("param_extra_avatar_enabled");
        this.A0J = this.A01.getBoolean("param_extra_ai_sticker_enabled");
        this.A0N = this.A01.getBoolean("param_extra_imagine_enabled");
        this.A0S = this.A01.getBoolean("param_extra_saved_sticker_enabled");
        this.A0U = this.A01.getBoolean("param_extra_sticker_packs_enabled");
        this.A0O = this.A01.getBoolean("param_extra_is_location_sticker_enabled");
        this.A0I = this.A01.getBoolean("param_extra_is_add_yours_sticker_enabled");
        this.A0L = this.A01.getBoolean("param_extra_is_cutout_sticker_enabled");
        this.A0Q = this.A01.getBoolean("param_extra_is_music_sticker_enabled");
        this.A0P = this.A01.getBoolean("param_extra_is_msys_thread");
        this.A0b = this.A01.getBoolean("param_extra_should_hide_tab_container");
        Serializable serializable = this.A01.getSerializable("param_extra_sticker_tray_entrypoint");
        if (serializable instanceof EnumC46186KcO) {
            this.A08 = (EnumC46186KcO) serializable;
        }
        this.A06 = new C7FJ(this.A05);
        this.A0B = (DirectThreadKey) this.A01.getParcelable("param_extra_direct_thread_key");
        this.A0H = this.A01.getStringArrayList("param_extra_social_stickers_user_ids");
        this.A0F = this.A01.getString("param_extra_bottom_sheet_session_id");
        C0f9.A09(399594303, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1385513711);
        this.A0d.A02(viewGroup);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_direct_sticker_picker);
        C0f9.A09(863015584, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1203538808);
        this.A0d.A01();
        super.onDestroyView();
        this.A0A = null;
        this.A0W = null;
        this.A03 = null;
        C0f9.A09(462790686, A02);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d3, code lost:
    
        if (r1.equals(r7) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b9  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45499KCo.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
