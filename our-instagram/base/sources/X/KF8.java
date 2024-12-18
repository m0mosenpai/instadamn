package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes8.dex */
public final class KF8 extends AbstractC65806TuP {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.FrameLayout, java.lang.Object, X.JkJ, android.view.ViewGroup] */
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 1);
        ?? frameLayout = new FrameLayout(context);
        C56352iT A01 = C56342iS.A01(null, AbstractC31176DnK.A0C(LayoutInflater.from(context).inflate(R.layout.action_bar, (ViewGroup) frameLayout), R.id.action_bar_container));
        frameLayout.A00 = A01;
        String str = "actionBarService";
        A01.EkS(true);
        C56352iT c56352iT = frameLayout.A00;
        if (c56352iT != null) {
            c56352iT.A0Q().setBackground(null);
            C56352iT c56352iT2 = frameLayout.A00;
            if (c56352iT2 != null) {
                c56352iT2.EkG(false);
                C56352iT c56352iT3 = frameLayout.A00;
                if (c56352iT3 != null) {
                    SearchEditText Ehl = c56352iT3.Ehl();
                    frameLayout.A01 = Ehl;
                    if (Ehl == null) {
                        str = "_editText";
                    } else {
                        Ehl.setSearchIconEnabled(false);
                        return frameLayout;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        C44423JkJ c44423JkJ = (C44423JkJ) view;
        C46501Ki0 c46501Ki0 = (C46501Ki0) AnonymousClass634.A06(c6fg, c102884kP);
        if (c46501Ki0 != null) {
            SearchEditText editText = c44423JkJ.getEditText();
            String A0F = c102884kP.A0F();
            if (A0F != null) {
                editText.setHint(A0F);
            }
            String str = c46501Ki0.A02;
            if (str != null) {
                editText.setText(str);
            }
            InterfaceC103384lE A09 = c102884kP.A09();
            if (A09 != null) {
                editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC42036Ik5(this, c6fg, c102884kP, A09));
            }
            editText.A0C = new C49665Lww(this, c46501Ki0, c6fg, c102884kP);
            editText.setClearButtonEnabled(!c102884kP.A0S(35, false));
            InterfaceC103384lE A0B = c102884kP.A0B(42);
            if (A0B != null) {
                C0fQ.A00(new LPM(0, A0B, this, c102884kP, c6fg), c44423JkJ.getBackButton());
                return null;
            }
            return null;
        }
        throw AbstractC166987dD.A18("A controller was defined for this component but none was found");
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        C44423JkJ c44423JkJ = (C44423JkJ) view;
        SearchEditText editText = c44423JkJ.getEditText();
        editText.setOnFocusChangeListener(null);
        editText.A0C = null;
        AbstractC31171DnF.A14(editText);
        editText.setHint((CharSequence) null);
        c44423JkJ.getBackButton().setOnClickListener(null);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public KF8(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
