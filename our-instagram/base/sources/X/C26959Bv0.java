package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Bv0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26959Bv0 extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final OHW A02;

    public C26959Bv0(InterfaceC11380iw interfaceC11380iw, UserSession userSession, OHW ohw) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = ohw;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        if (obj instanceof C2I) {
            anonymousClass306.A7a(1);
        } else {
            if (!(obj instanceof C2G) && !(obj instanceof C2H) && !(obj instanceof C2F) && !(obj instanceof C2J)) {
                return;
            }
            anonymousClass306.A7a(0);
        }
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        CWE cwe;
        int i2;
        C25939Bdg c25939Bdg;
        ClickableSpan[] clickableSpanArr;
        CharSequence text;
        ImageView.ScaleType scaleType;
        int A0G = AbstractC25231BEo.A0G(view, 897968847);
        if (obj instanceof CWE) {
            cwe = (CWE) obj;
        } else {
            cwe = null;
        }
        if (cwe != null) {
            view.setVisibility(0);
            BO2 bo2 = BO2.A00;
            Context context = view.getContext();
            SpannableStringBuilder A03 = bo2.A03(AbstractC166997dE.A0M(context), cwe);
            Object tag = view.getTag();
            if ((tag instanceof C25939Bdg) && (c25939Bdg = (C25939Bdg) tag) != null) {
                Drawable A00 = cwe.A00(context);
                GradientSpinnerAvatarView gradientSpinnerAvatarView = c25939Bdg.A04;
                if (A00 != null) {
                    gradientSpinnerAvatarView.setAvatarViewDrawable(A00);
                    if (!(cwe instanceof C2J) && !(cwe instanceof C2I)) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    } else {
                        scaleType = ImageView.ScaleType.CENTER;
                    }
                    gradientSpinnerAvatarView.setScaleType(scaleType);
                    gradientSpinnerAvatarView.setVisibility(0);
                    c25939Bdg.A00.setVisibility(0);
                } else {
                    gradientSpinnerAvatarView.setVisibility(8);
                    c25939Bdg.A00.setVisibility(8);
                }
                IgTextView igTextView = c25939Bdg.A02;
                igTextView.setText(A03);
                CharSequence A01 = cwe.A01(AbstractC166997dE.A0M(context));
                IgTextView igTextView2 = c25939Bdg.A03;
                if (A01 != null) {
                    igTextView2.setText(A01);
                    igTextView2.setVisibility(0);
                } else {
                    igTextView2.setVisibility(8);
                }
                Resources A0M = AbstractC166997dE.A0M(context);
                if ((cwe instanceof C2J) && ((C2J) cwe).A02 && (text = A0M.getText(2131976111)) != null) {
                    IgTextView igTextView3 = c25939Bdg.A01;
                    igTextView3.setText(text);
                    igTextView3.setVisibility(0);
                } else {
                    c25939Bdg.A01.setVisibility(8);
                }
                if (A03 != null && (clickableSpanArr = (ClickableSpan[]) A03.getSpans(0, A03.length(), ClickableSpan.class)) != null && clickableSpanArr.length != 0) {
                    igTextView.setMovementMethod(C6R6.A00);
                    c25939Bdg.itemView.setClickable(false);
                } else {
                    ViewOnClickListenerC28668ClG.A02(c25939Bdg.itemView, 35, cwe, this);
                }
                C28218CcI.A00.A00(this.A00, this.A01, cwe);
            } else {
                i2 = 1803851563;
                C0f9.A0A(i2, A0G);
            }
        } else {
            view.setVisibility(8);
        }
        i2 = 597273689;
        C0f9.A0A(i2, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A0D;
        int i2;
        int A03 = C0f9.A03(-318573707);
        C14360o3.A0B(viewGroup, 1);
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        if (i == 1) {
            A0D = AbstractC25227BEk.A0D(A0P, viewGroup, R.layout.feedback_from_facebook_comments_list_row, false);
            A0D.setTag(new C25939Bdg(A0D));
            i2 = 985157916;
        } else {
            A0D = AbstractC25227BEk.A0D(A0P, viewGroup, R.layout.feedback_from_facebook_likes_list_row, false);
            A0D.setTag(new C25939Bdg(A0D));
            i2 = 1808361676;
        }
        C0f9.A0A(i2, A03);
        return A0D;
    }
}
