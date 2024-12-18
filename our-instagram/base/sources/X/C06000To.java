package X;

import androidx.activity.ComponentActivity;

/* renamed from: X.0To, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06000To extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ ComponentActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06000To(ComponentActivity componentActivity) {
        super(0);
        this.A00 = componentActivity;
    }

    @Override // X.InterfaceC16820sZ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C72852Xp8 invoke() {
        ComponentActivity componentActivity = this.A00;
        return new C72852Xp8(componentActivity.reportFullyDrawnExecutor, new C06010Tp(componentActivity));
    }
}
