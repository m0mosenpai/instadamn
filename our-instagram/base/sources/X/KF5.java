package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class KF5 extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new IgdsInlineSearchBox(context, false);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view;
        C14360o3.A0B(igdsInlineSearchBox, 0);
        AbstractC167017dG.A1P(c6fg, c102884kP);
        C46501Ki0 c46501Ki0 = (C46501Ki0) AnonymousClass634.A06(c6fg, c102884kP);
        if (c46501Ki0 != null) {
            if (c102884kP.A0S(49, false)) {
                igdsInlineSearchBox.setSearchRowBackgroundColor(R.drawable.elevated_searchbar_background);
            }
            if (c102884kP.A0E() != null) {
                String A0E = c102884kP.A0E();
                C14360o3.A0A(A0E);
                igdsInlineSearchBox.setHint(A0E);
            }
            String str = c46501Ki0.A02;
            if (str != null) {
                igdsInlineSearchBox.A0E.setText(str);
            }
            int i = c46501Ki0.A01;
            if (i == -1) {
                String str2 = c46501Ki0.A02;
                if (str2 != null) {
                    igdsInlineSearchBox.setSelection(str2.length());
                }
            } else {
                igdsInlineSearchBox.A0E.setSelection(i, c46501Ki0.A00);
            }
            InterfaceC103384lE A0B = c102884kP.A0B(38);
            if (A0B != null) {
                igdsInlineSearchBox.A00 = new LQ5(c6fg, c102884kP, A0B);
            }
            String str3 = "";
            String A0L = c102884kP.A0L(48);
            if (A0L != null) {
                str3 = A0L;
            }
            if (str3.equals("slider")) {
                igdsInlineSearchBox.A06(new ViewOnClickListenerC48066LPr(11, c6fg, c102884kP), R.drawable.instagram_sliders_outline_16, 2131962565);
            } else {
                AbstractC25241Le.A03("BKSearchBarBinderUtils", new IOException(AnonymousClass001.A0R("Unsupported icon type: ", str3)));
            }
            igdsInlineSearchBox.A02 = new C70944Wkq(0, c46501Ki0, c6fg, c102884kP);
            igdsInlineSearchBox.A03 = c102884kP.A0S(41, false);
            return null;
        }
        throw AbstractC166987dD.A18("A controller was defined for this component but none was found");
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view;
        AbstractC167027dH.A12(igdsInlineSearchBox, c6fg, c102884kP);
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        if (A06 != null) {
            C46501Ki0 c46501Ki0 = (C46501Ki0) A06;
            if (igdsInlineSearchBox.getSelectionStart() != null) {
                Integer selectionStart = igdsInlineSearchBox.getSelectionStart();
                C14360o3.A0A(selectionStart);
                c46501Ki0.A01 = selectionStart.intValue();
            }
            if (igdsInlineSearchBox.getSelectionEnd() != null) {
                Integer selectionEnd = igdsInlineSearchBox.getSelectionEnd();
                C14360o3.A0A(selectionEnd);
                c46501Ki0.A00 = selectionEnd.intValue();
            }
            igdsInlineSearchBox.A02 = null;
            igdsInlineSearchBox.setOnFocusChangeListener(null);
            igdsInlineSearchBox.A0E.setText("");
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Extension mapper missing controller for extension with id: ");
        A1C.append(LDA.A00);
        throw AbstractC166987dD.A14(AbstractC166997dE.A0x(".STYLE_ID", A1C));
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public KF5(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
