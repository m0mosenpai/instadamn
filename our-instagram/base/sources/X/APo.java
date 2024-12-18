package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class APo implements TextWatcher, View.OnFocusChangeListener, InterfaceC190578cF, InterfaceC60152ox, C88V {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public RecyclerView A05;
    public AbstractRunnableC14200nk A06;
    public C148276lx A07;
    public SearchEditText A08;
    public User A09;
    public Integer A0A;
    public C38687GzS[] A0B;
    public int A0C;
    public final Context A0D;
    public final View.OnTouchListener A0E;
    public final View A0F;
    public final View A0G;
    public final ViewStub A0H;
    public final AbstractC018607g A0I;
    public final InterfaceC11380iw A0J;
    public final UserSession A0K;
    public final C190588cG A0L;
    public final InterfaceC1810081c A0M;
    public final C8NW A0N;
    public final InterfaceC169517hR A0O;
    public final int A0P;
    public final int A0Q;
    public final C3I9 A0R;

    public APo(View view, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3I9 c3i9, InterfaceC1810081c interfaceC1810081c, C8NW c8nw, InterfaceC169517hR interfaceC169517hR, int i) {
        this.A0M = interfaceC1810081c;
        this.A0D = AbstractC166997dE.A0L(view);
        this.A0K = userSession;
        this.A0J = interfaceC11380iw;
        this.A0I = abstractC018607g;
        this.A0N = c8nw;
        this.A0G = AbstractC166997dE.A0S(view, R.id.text_overlay_edit_text_container);
        this.A0H = AbstractC167007dF.A0M(view, R.id.share_professional_profile_sticker_editor_stub);
        C190588cG c190588cG = new C190588cG(interfaceC11380iw, userSession, this, interfaceC169517hR);
        this.A0L = c190588cG;
        this.A0R = c3i9;
        this.A0O = interfaceC169517hR;
        this.A0F = AbstractC166997dE.A0S(view, R.id.done_button);
        this.A0B = new C38687GzS[3];
        c190588cG.setHasStableIds(true);
        this.A0E = new ViewOnTouchListenerC209789Po(this, 5);
        Resources resources = view.getResources();
        this.A0P = AbstractC166997dE.A0E(resources);
        this.A0Q = i - (resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material) * 4);
        this.A0A = ProfileStickerModel.A08;
    }

    @Override // X.InterfaceC190578cF
    public final /* synthetic */ void DJn() {
    }

    @Override // X.InterfaceC190578cF
    public final /* synthetic */ void DJp(C217859kI c217859kI) {
    }

    @Override // X.InterfaceC190578cF
    public final /* synthetic */ void DN8() {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        if (editable.length() > 0) {
            this.A0L.A02(editable);
        } else {
            this.A0L.A01();
        }
        SearchEditText searchEditText = this.A08;
        if (searchEditText != null) {
            AbstractC202818xz.A06(searchEditText, this.A0P, this.A0Q);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C14360o3.A0B(view, 0);
        C3I9 c3i9 = this.A0R;
        if (z) {
            c3i9.A9e(this);
            AbstractC13880nE.A0S(view);
        } else {
            c3i9.EFx(this);
            AbstractC13880nE.A0O(view);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final ProfileStickerModel A00(APo aPo) {
        C148276lx c148276lx = aPo.A07;
        if (c148276lx != null) {
            ProfileStickerModel profileStickerModel = new ProfileStickerModel(c148276lx, null, aPo.A09, aPo.A0A, C05F.A00);
            profileStickerModel.A00 = aPo.A0B;
            return profileStickerModel;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(APo aPo, User user) {
        aPo.A09 = user;
        C61972ry c61972ry = new C61972ry(aPo.A0D, aPo.A0I, null);
        C25621Ms c25621Ms = new C25621Ms(aPo.A0K, -2);
        c25621Ms.A06();
        c25621Ms.A9s("ig_biz_id", user.getId());
        c25621Ms.A0B("business/account/get_ranked_media/");
        c25621Ms.A0R(C74293Vk.class, C74313Vm.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new MWM(1, user, aPo);
        c61972ry.schedule(A0N);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (this.A0C > i) {
            SearchEditText searchEditText = this.A08;
            if (searchEditText != null) {
                searchEditText.clearFocus();
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        this.A0C = i;
        View view = this.A01;
        if (view != null) {
            if (!z) {
                i = 0;
            }
            AbstractC13880nE.A0Y(view, i);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC190578cF
    public final void DSl(User user, int i) {
        A01(this, user);
    }

    @Override // X.C88V
    public final void DkN(SearchEditText searchEditText, int i, int i2) {
        AbstractC167027dH.A0q(searchEditText, i, i2);
    }
}
