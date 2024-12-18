package X;

import com.facebook.proxygen.HTTPRequestError;
import java.io.IOException;

/* renamed from: X.Rdy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61030Rdy extends IOException {
    public final HTTPRequestError A00;

    public C61030Rdy(HTTPRequestError hTTPRequestError) {
        super(hTTPRequestError.mErrMsg);
        this.A00 = hTTPRequestError;
    }
}
