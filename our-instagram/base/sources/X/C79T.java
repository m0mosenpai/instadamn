package X;

import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.ui.widget.expandingtextview.ExpandingTextView;
import java.util.Collections;

/* renamed from: X.79T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C79T implements C7QC {
    public final InterfaceC165247aD A00;
    public final C162907Rb A01;
    public final UserSession A05;
    public final InterfaceC89443yk A02 = new InterfaceC89443yk() { // from class: X.79U
        @Override // X.InterfaceC89443yk
        public final void D3U(ClickableSpan clickableSpan, View view, String str) {
            ((InterfaceC165407aT) C79T.this.A00).CqX(str);
        }
    };
    public final InterfaceC89443yk A04 = new InterfaceC89443yk() { // from class: X.79V
        @Override // X.InterfaceC89443yk
        public final void D3U(ClickableSpan clickableSpan, View view, String str) {
            ((InterfaceC165157a4) C79T.this.A00).CrN(str);
        }
    };
    public final InterfaceC89443yk A03 = new InterfaceC89443yk() { // from class: X.79W
        @Override // X.InterfaceC89443yk
        public final void D3U(ClickableSpan clickableSpan, View view, String str) {
            ((InterfaceC165287aH) C79T.this.A00).Cr4(str);
        }
    };

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        final C1585179m c1585179m = (C1585179m) c7qd;
        final AnonymousClass781 anonymousClass781 = (AnonymousClass781) interfaceC129555tK;
        ExpandingTextView expandingTextView = c1585179m.A05;
        boolean z = anonymousClass781.A0A;
        expandingTextView.A04 = z;
        expandingTextView.setMaxLines(3);
        expandingTextView.setExpandState(EnumC1585079l.COLLAPSED);
        if (z) {
            expandingTextView.A02 = expandingTextView.getContext().getString(2131960241);
        }
        AnonymousClass786 anonymousClass786 = new AnonymousClass786() { // from class: X.75p
            @Override // X.AnonymousClass786
            public final void DBL() {
                C1585179m c1585179m2 = C1585179m.this;
                c1585179m2.A00.DBb(anonymousClass781, c1585179m2);
            }
        };
        expandingTextView.setMaxWidth(C7N9.A00(expandingTextView.getContext(), anonymousClass781.A0F));
        CharSequence charSequence = anonymousClass781.A04;
        if (charSequence instanceof Spannable) {
            C78K.A02((Spannable) charSequence, this.A02, this.A03, new InterfaceC89443yk() { // from class: X.LsT
                @Override // X.InterfaceC89443yk
                public final void D3U(ClickableSpan clickableSpan, View view, String str) {
                    C79T c79t = C79T.this;
                    AnonymousClass781 anonymousClass7812 = anonymousClass781;
                    InterfaceC165247aD interfaceC165247aD = c79t.A00;
                    if (interfaceC165247aD != null) {
                        ((InterfaceC165067Zv) interfaceC165247aD).Cs3(str, true, anonymousClass7812.BSy().A01);
                    }
                }
            }, this.A04, null, null, anonymousClass786);
        }
        expandingTextView.setEllipsisTextColor(AbstractC162737Qk.A00(anonymousClass781.A03.A03, ((AbstractC129515tG) anonymousClass781).A00.CVC()));
        C78K.A00(c1585179m.A02, expandingTextView, null, anonymousClass781);
        this.A01.A02(c1585179m, anonymousClass781);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C1585179m c1585179m = (C1585179m) c7qd;
        CharSequence text = c1585179m.A05.getText();
        if (text instanceof Spannable) {
            C78K.A01((Spannable) text);
        }
        this.A01.A01(c1585179m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C79T(UserSession userSession, final InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A00 = interfaceC165247aD;
        this.A05 = userSession;
        this.A01 = new C162907Rb(Collections.singletonList(new C158977Bj(new C162897Ra(interfaceC165247aD), new C7Q6(interfaceC165247aD) { // from class: X.79X
            public final InterfaceC164967Zl A00;

            @Override // X.C7Q6
            public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
                InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) obj;
                C7QD c7qd = (C7QD) obj2;
                C14360o3.A0B(interfaceC129525tH, 0);
                C14360o3.A0B(c7qd, 1);
                boolean BCt = interfaceC129525tH.BCt();
                MessageIdentifier BSy = interfaceC129525tH.BSy();
                InterfaceC164967Zl interfaceC164967Zl = this.A00;
                if (!AbstractC46806Kn1.A00(interfaceC164967Zl, BSy, BCt)) {
                    MessageIdentifier ArP = interfaceC129525tH.ArP();
                    if (ArP != null) {
                        ((InterfaceC164927Zh) interfaceC164967Zl).AUz(c7qd, ArP.A01, true);
                    } else {
                        return false;
                    }
                }
                return true;
            }

            {
                this.A00 = interfaceC165247aD;
            }
        }, new C7Q7(interfaceC165247aD), new C7Q9(interfaceC165247aD, anonymousClass988.A1U), interfaceC165247aD, anonymousClass988, R.id.direct_expandable_text_message_text_view)));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.direct_expandable_text_message, viewGroup, false);
        C1585179m c1585179m = new C1585179m(inflate, (ExpandingTextView) inflate.requireViewById(R.id.direct_expandable_text_message_text_view));
        this.A01.A00(c1585179m);
        return c1585179m;
    }
}
