package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.Ah5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23853Ah5 implements InterfaceC25184BCh, InterfaceC25183BCg {
    public int A00;
    public int A01;
    public IgEditText A02;
    public IgSimpleImageView A03;
    public IgSimpleImageView A04;
    public IgSimpleImageView A05;
    public IgSimpleImageView A06;
    public IgTextView A07;
    public IgTextView A08;
    public PromptStickerModel A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Activity A0E;
    public final Context A0F;
    public final View.OnFocusChangeListener A0G;
    public final UserSession A0H;
    public final InterfaceC1810081c A0I;
    public final C88W A0J;
    public final String A0K;
    public final List A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final C8O8 A0R;
    public final C8NX A0S;
    public final InterfaceC195198kL A0T;

    public C23853Ah5(Activity activity, View view, UserSession userSession, C3I9 c3i9, C8O8 c8o8, InterfaceC1810081c interfaceC1810081c, C8NX c8nx, String str) {
        AbstractC167007dF.A1I(str, 3, c8o8);
        this.A0H = userSession;
        this.A0E = activity;
        this.A0K = str;
        this.A0I = interfaceC1810081c;
        this.A0S = c8nx;
        this.A0R = c8o8;
        Context context = view.getContext();
        this.A0F = context;
        this.A0M = B8S.A00(view, 21);
        this.A0Q = B8S.A00(view, 26);
        this.A0O = B8S.A00(this, 24);
        this.A0P = B8S.A00(view, 25);
        this.A0N = B8S.A00(view, 23);
        C24161Ank c24161Ank = new C24161Ank(this, 3);
        this.A0T = c24161Ank;
        C14360o3.A07(context);
        this.A0J = new C88W(context, c3i9, c24161Ank);
        this.A0G = new ViewOnFocusChangeListenerC23253ASo(this, 2);
        this.A0A = AbstractC166987dD.A1E();
        this.A0L = AbstractC16960so.A1Q(Integer.valueOf(AbstractC166997dE.A03(context)), Integer.valueOf(context.getColor(R.color.black)));
    }

    public static final void A00(C23853Ah5 c23853Ah5, int i) {
        Integer num;
        PromptStickerModel promptStickerModel = c23853Ah5.A09;
        String str = "model";
        if (promptStickerModel != null) {
            promptStickerModel.A09(AbstractC13950nL.A0F(i));
            Drawable mutate = AbstractC166987dD.A0d(c23853Ah5.A0Q).getBackground().mutate();
            C14360o3.A0C(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) mutate).setColor(i);
            IgEditText igEditText = c23853Ah5.A02;
            if (igEditText == null) {
                str = "stickerEditText";
            } else {
                igEditText.setTextColor(AbstractC13950nL.A08(i, 1.0f));
                Drawable mutate2 = AbstractC166987dD.A0d(c23853Ah5.A0O).getBackground().mutate();
                C14360o3.A0C(mutate2, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                Context context = c23853Ah5.A0F;
                C14360o3.A06(context);
                ((ColorDrawable) mutate2).setColor(context.getColor(AE3.A00(context, i)));
                PromptStickerModel promptStickerModel2 = c23853Ah5.A09;
                if (promptStickerModel2 != null) {
                    if (promptStickerModel2.A0H()) {
                        num = C05F.A01;
                    } else {
                        num = C05F.A0C;
                    }
                    IgSimpleImageView igSimpleImageView = c23853Ah5.A06;
                    if (igSimpleImageView != null) {
                        String str2 = c23853Ah5.A0K;
                        PromptStickerModel promptStickerModel3 = c23853Ah5.A09;
                        if (promptStickerModel3 != null) {
                            igSimpleImageView.setImageDrawable(new C180547zi(context, promptStickerModel3, num, str2, i, 0, 224));
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC25183BCg
    public final View B0N() {
        return AbstractC166987dD.A0d(this.A0Q);
    }

    @Override // X.InterfaceC25183BCg
    public final Class C0Y() {
        return C221009pO.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0258, code lost:
    
        if (r9 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0303, code lost:
    
        if (r8 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ca, code lost:
    
        if (r24.A0D != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d9  */
    @Override // X.InterfaceC25184BCh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DDv(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23853Ah5.DDv(java.lang.Object):void");
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        String str;
        PromptStickerModel promptStickerModel = this.A09;
        String str2 = "model";
        if (promptStickerModel != null) {
            IgEditText igEditText = this.A02;
            if (igEditText == null) {
                str2 = "stickerEditText";
            } else {
                Editable text = igEditText.getText();
                C14360o3.A07(text);
                promptStickerModel.A0B(AbstractC001900j.A0B(text).toString());
                InterfaceC09390do interfaceC09390do = this.A0P;
                if (AbstractC167007dF.A1a(interfaceC09390do)) {
                    AbstractC166997dE.A1J((View) this.A0M.getValue(), AbstractC167017dG.A0V(interfaceC09390do), false);
                }
                this.A0B = false;
                PromptStickerModel promptStickerModel2 = this.A09;
                if (promptStickerModel2 != null) {
                    if (promptStickerModel2.A0H()) {
                        str = "clips_prompt_sticker_bundle_id";
                    } else {
                        str = "prompt_sticker_bundle_id";
                    }
                    this.A0R.Doh(str);
                    C8NX c8nx = this.A0S;
                    PromptStickerModel promptStickerModel3 = this.A09;
                    if (promptStickerModel3 != null) {
                        c8nx.Dog(promptStickerModel3, str);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
