package X;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.LQu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC48094LQu implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewTreeObserverOnGlobalLayoutListenerC48094LQu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object obj;
        ViewTreeObserver viewTreeObserver;
        FragmentActivity requireActivity;
        int i;
        switch (this.A00) {
            case 0:
                C45487KCc c45487KCc = (C45487KCc) this.A02;
                IgTextView igTextView = c45487KCc.A0F;
                if (igTextView != null) {
                    if (igTextView.getLayout() == null) {
                        return;
                    }
                    IgTextView igTextView2 = c45487KCc.A0F;
                    if (igTextView2 != null) {
                        CharSequence text = igTextView2.getText();
                        C14360o3.A0C(text, "null cannot be cast to non-null type android.text.Spannable");
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) C4GL.A06((Spanned) text, ClickableSpan.class);
                        if (clickableSpanArr.length > 1) {
                            ClickableSpan clickableSpan = clickableSpanArr[0];
                            IgTextView igTextView3 = c45487KCc.A0F;
                            if (igTextView3 != null) {
                                C51u A00 = VWD.A00(clickableSpan, igTextView3, true);
                                ClickableSpan clickableSpan2 = clickableSpanArr[1];
                                IgTextView igTextView4 = c45487KCc.A0F;
                                if (igTextView4 != null) {
                                    C51u A002 = VWD.A00(clickableSpan2, igTextView4, true);
                                    int A0H = AbstractC166987dD.A0H(A002.A01) - AbstractC166987dD.A0H(A00.A01);
                                    int A0H2 = AbstractC166987dD.A0H(A002.A00) - (AbstractC25235BEs.A04(c45487KCc.requireActivity()) + (AbstractC167017dG.A03(c45487KCc.requireActivity()) * 2));
                                    FragmentActivity requireActivity2 = c45487KCc.requireActivity();
                                    C45842KQx c45842KQx = (C45842KQx) this.A01;
                                    if (c45842KQx.A07 != null) {
                                        requireActivity = c45487KCc.requireActivity();
                                        i = 2131968789;
                                    } else {
                                        NotePogVideoDict notePogVideoDict = c45842KQx.A03;
                                        requireActivity = c45487KCc.requireActivity();
                                        i = 2131968790;
                                        if (notePogVideoDict != null) {
                                            i = 2131968794;
                                        }
                                    }
                                    C5SU A0f = AbstractC167017dG.A0f(requireActivity2, requireActivity.getString(i));
                                    IgTextView igTextView5 = c45487KCc.A0F;
                                    if (igTextView5 != null) {
                                        A0f.A05(new C207559Gj(igTextView5, A0H2, A0H, false));
                                        A0f.A02();
                                        A0f.A0A = true;
                                        C5SW A003 = A0f.A00();
                                        IgTextView igTextView6 = c45487KCc.A0F;
                                        if (igTextView6 != null) {
                                            igTextView6.postDelayed(new M40(c45487KCc, A003), 750L);
                                        }
                                    }
                                }
                            }
                        }
                        IgTextView igTextView7 = c45487KCc.A0F;
                        if (igTextView7 != null) {
                            viewTreeObserver = igTextView7.getViewTreeObserver();
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        }
                    }
                }
                C14360o3.A0F("noteReplyContextText");
                throw C00O.createAndThrow();
            case 1:
                ((C48259LXi) this.A01).A04();
                obj = this.A02;
                break;
            default:
                LKK.A01((LKK) this.A02);
                obj = this.A01;
                break;
        }
        viewTreeObserver = (ViewTreeObserver) obj;
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
