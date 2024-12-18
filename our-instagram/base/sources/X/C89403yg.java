package X;

import android.view.View;

/* renamed from: X.3yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89403yg extends AbstractC89413yh {
    public InterfaceC89443yk A00;
    public AnonymousClass786 A01;
    public final Integer A02;
    public final String A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C89403yg(Integer num, String str, int i, boolean z) {
        this(num, str, "", i, z);
        C14360o3.A0B(str, 2);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        InterfaceC89443yk interfaceC89443yk = this.A00;
        if (interfaceC89443yk != null) {
            interfaceC89443yk.D3U(this, view, this.A03);
        }
    }

    @Override // X.InterfaceC89423yi
    public final void DBM(View view) {
        AnonymousClass786 anonymousClass786 = this.A01;
        if (anonymousClass786 != null) {
            anonymousClass786.DBL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89403yg(Integer num, String str, String str2, int i, boolean z) {
        super(str2, i, z);
        C14360o3.A0B(str, 2);
        C14360o3.A0A(str2);
        this.A02 = num;
        this.A03 = str;
    }
}
