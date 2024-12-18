package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import java.util.function.Function;

/* renamed from: X.Eex, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32966Eex extends AbstractC85543rj {
    public final int A00 = 3;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32966Eex(G3P g3p, MessageIdentifier messageIdentifier, Integer num, int i) {
        super("", i, true);
        this.A03 = g3p;
        this.A01 = messageIdentifier;
        this.A02 = num;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        switch (this.A00) {
            case 0:
                G3O g3o = (G3O) this.A03;
                InterfaceC163837Ux C7r = g3o.A01.C7r();
                int AdZ = C7r.AdZ();
                InterfaceC83733oI CCa = C7r.CCa();
                String C7q = C7r.C7q();
                C142846ck A0d = AbstractC31172DnG.A0d(g3o.A03);
                String A0f = AbstractC31177DnL.A0f(CCa);
                C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, A0d);
                    AbstractC31174DnI.A1I(A0I, "translation_footer_nux_clicked");
                    A0I.A0o(AbstractC111324zv.A00(5507));
                    AbstractC31177DnL.A1H(A0I, A0d, AbstractC31179DnN.A0a(A0I, "thread_view", A0f, C7q, AdZ));
                }
                Context context = (Context) this.A02;
                C193328hC A0I2 = AbstractC31171DnF.A0I(context);
                A0I2.A0k(context.getDrawable(R.drawable.ig_illustrations_illo_translate_refresh));
                A0I2.A0A(2131958850);
                A0I2.A09(2131958847);
                A0I2.A0K(new DialogInterfaceOnClickListenerC35360Fib(this.A01, CCa, g3o, C7q, AdZ, 1), 2131958849);
                A0I2.A0H(new DialogInterfaceOnClickListenerC35346FiN(g3o, CCa, C7q, AdZ), 2131958848);
                A0I2.A0h(new DialogInterfaceOnShowListenerC35465FkM(g3o, CCa, C7q, AdZ));
                AbstractC166987dD.A1W(A0I2);
                return;
            case 1:
                G3P g3p = (G3P) this.A03;
                MessageIdentifier messageIdentifier = (MessageIdentifier) this.A01;
                Integer num = (Integer) this.A02;
                g3p.Dtc(messageIdentifier, num);
                FPH fph = g3p.A01;
                InterfaceC83733oI interfaceC83733oI = g3p.A03;
                boolean A1X = AbstractC167007dF.A1X(num, C05F.A01);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(fph.A00, "direct_message_translation_toggle");
                if (!A0f2.isSampled()) {
                    return;
                }
                if (A1X) {
                    str = "show";
                } else {
                    str = "hide";
                }
                AbstractC31171DnF.A1C(A0f2, str);
                AbstractC31171DnF.A1H(A0f2, AbstractC31177DnL.A0f(interfaceC83733oI));
                A0f2.Cht();
                return;
            case 2:
                ((C36412G4n) this.A03).DtZ((MessageIdentifier) this.A01, (Integer) this.A02);
                return;
            default:
                Function function = (Function) this.A02;
                C26000Beo c26000Beo = (C26000Beo) this.A01;
                String str2 = ((C5HW) this.A03).A04.A0o;
                str2.getClass();
                function.apply(InlineLinkUrn.Companion.A00(c26000Beo, str2));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32966Eex(Context context, G3O g3o, InterfaceC164947Zj interfaceC164947Zj, int i) {
        super("", i, true);
        this.A03 = g3o;
        this.A02 = context;
        this.A01 = interfaceC164947Zj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32966Eex(C26000Beo c26000Beo, C5HW c5hw, Function function, int i) {
        super(true, i);
        this.A02 = function;
        this.A01 = c26000Beo;
        this.A03 = c5hw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32966Eex(C36412G4n c36412G4n, MessageIdentifier messageIdentifier, Integer num, int i) {
        super("", i, true);
        this.A03 = c36412G4n;
        this.A01 = messageIdentifier;
        this.A02 = num;
    }
}
