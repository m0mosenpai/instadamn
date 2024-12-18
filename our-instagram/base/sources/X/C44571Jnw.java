package X;

import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Jnw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44571Jnw extends C2UU {
    public C45509KCy A00;
    public final UserSession A03;
    public final String A04;
    public final int A08;
    public final int A09;
    public final Activity A0A;
    public final C45509KCy A0C;
    public final InterfaceC11380iw A0D;
    public final Handler A0B = new Handler();
    public final HashSet A05 = AbstractC166987dD.A1H();
    public final AbstractC70653Fc A02 = new C44286Jhc(this, 8);
    public final List A06 = AbstractC166987dD.A1E();
    public final int A01 = 2;
    public final boolean A07 = true;

    public C44571Jnw(Activity activity, C45509KCy c45509KCy, C45509KCy c45509KCy2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A0A = activity;
        this.A03 = userSession;
        this.A0D = interfaceC11380iw;
        this.A00 = c45509KCy;
        int i = 0;
        this.A0C = c45509KCy2;
        this.A04 = str;
        int A0A = AbstractC13880nE.A0A(activity);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i2 = dimensionPixelSize % 2;
        this.A09 = (A0A - (i2 != 0 ? dimensionPixelSize + (2 - i2) : dimensionPixelSize)) / 2;
        int A0A2 = AbstractC13880nE.A0A(activity);
        this.A08 = (int) ((A0A2 - (AbstractC166997dE.A04(activity, R.dimen.photo_grid_spacing) % 2 != 0 ? r1 + (2 - r0) : r1)) / (2.0f * 0.643f));
        do {
            this.A06.add(LHy.A02);
            i++;
        } while (i < 6);
        this.A06.add(LHy.A03);
    }

    public final C38321qM A00(int i) {
        LHy lHy;
        C46520KiJ c46520KiJ;
        List A0O;
        List list = this.A06;
        if (list == null || i >= list.size() || (lHy = (LHy) list.get(i)) == null || (c46520KiJ = lHy.A00) == null) {
            return null;
        }
        UserSession userSession = this.A03;
        Reel reel = c46520KiJ.A03;
        if (reel == null || (A0O = reel.A0O(userSession)) == null || A0O.isEmpty()) {
            return null;
        }
        return ((C41181vS) AbstractC166987dD.A16(A0O)).A0b;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        AttributedAREffect attributedAREffect;
        ProductAREffectContainer productAREffectContainer;
        LHy lHy = (LHy) this.A06.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType != 3) {
                        throw AbstractC166987dD.A14("unhandled item type");
                    }
                    return;
                }
                C44755Jrc c44755Jrc = (C44755Jrc) c3oo;
                if (i % 2 == 0) {
                    c44755Jrc.A00();
                    return;
                } else {
                    this.A0B.postDelayed(new M3L(c44755Jrc, this), r11 * 600);
                    return;
                }
            }
            AbstractC12120kG.A01("EffectsPreviewVideoAdapter", "ITEM_TYPE_HERO_UNIT should never have null hero unit");
            return;
        }
        C46520KiJ c46520KiJ = lHy.A00;
        if (c46520KiJ != null) {
            C44795JsG c44795JsG = (C44795JsG) c3oo;
            InterfaceC11380iw interfaceC11380iw = this.A0D;
            c44795JsG.A01 = c46520KiJ;
            Reel reel = c46520KiJ.A03;
            if (reel == null || (attributedAREffect = reel.A0G) == null || (productAREffectContainer = attributedAREffect.A04) == null || (str = productAREffectContainer.A00.A01.A0e) == null) {
                str = c46520KiJ.A06;
            }
            if (str != null) {
                c44795JsG.A04.setText(str);
                View view = c44795JsG.itemView;
                AbstractC37302Gc3.A0o(view.getContext(), view, str, 2131953161);
            }
            if (c46520KiJ.A01() != null) {
                TextView textView = c44795JsG.A03;
                AbstractC31177DnL.A0r(textView.getContext(), textView, c46520KiJ.A01(), 2131961687);
                textView.setVisibility(0);
            }
            ImageUrl A00 = c46520KiJ.A00();
            if (A00 != null) {
                c44795JsG.A06.setUrl(A00, interfaceC11380iw);
            }
            ImageUrl imageUrl = c46520KiJ.A02;
            if (imageUrl != null) {
                c44795JsG.A05.A02(imageUrl, null);
            }
            c44795JsG.A02 = c46520KiJ.A03;
            C38321qM A002 = A00(i);
            if (A002 != null) {
                C45509KCy c45509KCy = this.A0C;
                int i2 = lHy.A01;
                View view2 = c44795JsG.itemView;
                IEC iec = new IEC(i / 2, i);
                C14360o3.A0B(view2, 1);
                if (i2 == 0) {
                    C47511Kye c47511Kye = c45509KCy.A02;
                    if (c47511Kye == null) {
                        C14360o3.A0F("gridImpressionsTracker");
                        throw C00O.createAndThrow();
                    }
                    C59072n8 A003 = C59062n7.A00(A002, iec, A002.getId());
                    A003.A00(c47511Kye.A00);
                    AbstractC25227BEk.A10(view2, A003, c47511Kye.A01);
                    return;
                }
                C0w9.A03(C45509KCy.__redex_internal_original_name, AnonymousClass001.A0O("Unhandled preview item type: ", i2));
            }
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(270619770);
        int size = this.A06.size();
        C0f9.A0A(-596288762, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-521040218);
        int i2 = ((LHy) this.A06.get(i)).A01;
        C0f9.A0A(-85443868, A03);
        return i2;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new E42(A0P.inflate(R.layout.camera_effects_bottom_loading, viewGroup, false), 0, this);
                    }
                    throw AbstractC166987dD.A14("unhandled item type");
                }
                View inflate = A0P.inflate(R.layout.camera_effects_view_preview_video_loading_holder, viewGroup, false);
                AbstractC13880nE.A0W(inflate, this.A08);
                return new C44755Jrc(inflate);
            }
            return new C44746JrT(A0P.inflate(R.layout.hero_unit_layout, viewGroup, false), this.A03, this);
        }
        View inflate2 = A0P.inflate(R.layout.camera_effects_view_preview_video_view_holder, viewGroup, false);
        AbstractC13880nE.A0W(inflate2, this.A08);
        AbstractC13880nE.A0g(inflate2, this.A09);
        C44795JsG c44795JsG = new C44795JsG(inflate2);
        c44795JsG.A00 = this.A00;
        return c44795JsG;
    }
}
