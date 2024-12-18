package X;

import android.app.Activity;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.ui.text.fittingtextview.FittingTextView;

/* loaded from: classes9.dex */
public final class OyU implements InterfaceC25184BCh, InterfaceC195198kL {
    public int A00;
    public View A01;
    public View A02;
    public TextView A03;
    public IgEditText A04;
    public C51853Mvx A05;
    public FittingTextView A06;
    public C221539qI A07;
    public final Activity A08;
    public final View A09;
    public final ViewStub A0A;
    public final UserSession A0B;
    public final InterfaceC60152ox A0C = new C56177Owk(this, 0);
    public final C3I9 A0D;
    public final InterfaceC1810081c A0E;
    public final C8NX A0F;

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        String str;
        C14360o3.A0B(obj, 0);
        if (this.A01 == null) {
            View inflate = this.A0A.inflate();
            this.A01 = inflate;
            str = "containerView";
            if (inflate != null) {
                this.A02 = inflate.findViewById(R.id.badges_thanks_supporter_sticker_card);
                View view = this.A01;
                if (view != null) {
                    this.A03 = AbstractC166987dD.A0e(view, R.id.badges_thanks_supporter_sticker_helper_text);
                    View view2 = this.A01;
                    if (view2 != null) {
                        IgEditText igEditText = (IgEditText) view2.findViewById(R.id.badges_thanks_supporter_sticker_edit_text);
                        igEditText.setTypeface(AbstractC15960qq.A00(AbstractC166997dE.A0L(igEditText)).A02(EnumC15950qp.A0W));
                        igEditText.addTextChangedListener(new C221519qG(igEditText));
                        C221539qI c221539qI = new C221539qI(igEditText);
                        this.A07 = c221539qI;
                        igEditText.addTextChangedListener(c221539qI);
                        igEditText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                        ViewOnFocusChangeListenerC55473OkS.A00(igEditText, 0, this);
                        this.A04 = igEditText;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        View view3 = this.A09;
        View view4 = this.A01;
        if (view4 == null) {
            str = "containerView";
        } else {
            AbstractC125325le.A04(null, new View[]{view3, view4, this.A06}, false);
            IgEditText igEditText2 = this.A04;
            if (igEditText2 == null) {
                str = "inputEditText";
            } else {
                igEditText2.requestFocus();
                C51853Mvx c51853Mvx = ((C188008Ur) obj).A00;
                IgEditText igEditText3 = this.A04;
                String str2 = "inputEditText";
                if (igEditText3 != null) {
                    igEditText3.setText(c51853Mvx.A06);
                    int i = c51853Mvx.A00;
                    TextView textView = this.A03;
                    if (textView == null) {
                        str2 = "helperText";
                    } else {
                        Activity activity = this.A08;
                        AnonymousClass773.A07(new NXs(this, i, activity.getColor(AbstractC53242c7.A0A(activity))), textView, AbstractC166997dE.A0p(activity, 2131976483), AbstractC167017dG.A0k(activity.getResources(), i, R.plurals.user_pay_badges_thanks_sticker_notified_supporters_number));
                        IgEditText igEditText4 = this.A04;
                        if (igEditText4 != null) {
                            igEditText3.setSelection(igEditText4.length());
                            this.A05 = c51853Mvx;
                            return;
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC195198kL
    public final /* synthetic */ void DOI() {
    }

    @Override // X.InterfaceC195198kL
    public final /* synthetic */ void E0p(int i, int i2) {
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        String str;
        IgEditText igEditText = this.A04;
        if (igEditText != null) {
            igEditText.clearFocus();
            this.A0D.EFx(this.A0C);
            IgEditText igEditText2 = this.A04;
            if (igEditText2 != null) {
                AbstractC13880nE.A0O(igEditText2);
                C8NX c8nx = this.A0F;
                c8nx.DOI();
                IgEditText igEditText3 = this.A04;
                if (igEditText3 != null) {
                    String A0g = AbstractC167007dF.A0g(igEditText3);
                    int length = A0g.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        int i2 = length;
                        if (!z) {
                            i2 = i;
                        }
                        boolean A19 = AbstractC167027dH.A19(A0g, i2);
                        if (!z) {
                            if (!A19) {
                                z = true;
                            } else {
                                i++;
                            }
                        } else if (!A19) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    String A0g2 = AbstractC31177DnL.A0g(A0g, length, i);
                    if (A0g2.length() == 0) {
                        A0g2 = this.A08.getString(2131976478);
                    }
                    C51853Mvx c51853Mvx = this.A05;
                    str = "model";
                    if (c51853Mvx != null) {
                        c8nx.Dog(new C51853Mvx(c51853Mvx.A01, c51853Mvx.A02, A0g2, c51853Mvx.A03, c51853Mvx.A04, c51853Mvx.A05, c51853Mvx.A00), "");
                        View view = this.A09;
                        View view2 = this.A01;
                        if (view2 == null) {
                            str = "containerView";
                        } else {
                            AbstractC125325le.A05(new View[]{view, view2, this.A06}, false);
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
        }
        str = "inputEditText";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public OyU(Activity activity, View view, UserSession userSession, C3I9 c3i9, InterfaceC1810081c interfaceC1810081c, C8NX c8nx) {
        this.A08 = activity;
        this.A0B = userSession;
        this.A0E = interfaceC1810081c;
        this.A0D = c3i9;
        this.A0F = c8nx;
        this.A09 = AbstractC166987dD.A0c(view, R.id.text_overlay_edit_text_container);
        this.A0A = (ViewStub) AbstractC166987dD.A0c(view, R.id.badges_thanks_supporter_sticker_editor_stub);
        this.A06 = (FittingTextView) AbstractC166987dD.A0c(view, R.id.done_button);
    }
}
