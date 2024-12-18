package androidx.compose.foundation.text;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C119365at;
import X.C19L;
import X.C1JX;
import X.C25585BSy;
import X.C50533MSm;
import X.C5XO;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import X.InterfaceC58269PsN;
import X.InterfaceC74953Yl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C5XO A03;
    public final /* synthetic */ InterfaceC74953Yl A04;
    public final /* synthetic */ C19L A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(C5XO c5xo, InterfaceC74953Yl interfaceC74953Yl, InterfaceC23621Ds interfaceC23621Ds, C19L c19l) {
        super(3, interfaceC23621Ds);
        this.A05 = c19l;
        this.A04 = interfaceC74953Yl;
        this.A03 = c5xo;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C119365at) obj2).A00;
        C19L c19l = this.A05;
        InterfaceC74953Yl interfaceC74953Yl = this.A04;
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.A03, interfaceC74953Yl, (InterfaceC23621Ds) obj3, c19l);
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.A02 = obj;
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.A01 = j;
        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC58269PsN interfaceC58269PsN = (InterfaceC58269PsN) this.A02;
            long j = this.A01;
            AbstractC166987dD.A1Z(new C25585BSy(this.A04, this.A03, (InterfaceC23621Ds) null, 3, j), this.A05);
            this.A00 = 1;
            obj = interfaceC58269PsN.F8j(this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        boolean A1a = AbstractC166987dD.A1a(obj);
        AbstractC166987dD.A1Z(new C50533MSm(this.A04, A1a, this.A03, (InterfaceC23621Ds) null, 1), this.A05);
        return C0eB.A00;
    }
}
