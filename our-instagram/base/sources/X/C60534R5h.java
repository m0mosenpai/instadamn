package X;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;

@Deprecated
/* renamed from: X.R5h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60534R5h extends T0b implements InterfaceC65544TmJ {
    public int A00;
    public final int A01;
    public final ReadableArray A02;
    public final /* synthetic */ SZN A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60534R5h(ReadableArray readableArray, SZN szn, int i, int i2) {
        super(szn, i);
        this.A03 = szn;
        this.A00 = 0;
        this.A01 = i2;
        this.A02 = readableArray;
    }

    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        try {
            this.A03.A0L.A05(super.A00, this.A01, this.A02);
        } catch (Throwable th) {
            ReactSoftExceptionLogger.logSoftException("UIViewOperationQueue", AbstractC58318PtA.A0e("Error dispatching View Command", th));
        }
    }

    @Override // X.InterfaceC65544TmJ
    public final void ATc() {
        this.A03.A0L.A05(super.A00, this.A01, this.A02);
    }

    @Override // X.InterfaceC65544TmJ
    public final int Box() {
        return this.A00;
    }

    @Override // X.InterfaceC65544TmJ
    public final void CNG() {
        this.A00++;
    }
}
