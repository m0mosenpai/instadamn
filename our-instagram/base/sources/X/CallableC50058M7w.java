package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.M7w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50058M7w implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C29461bN A01;

    public CallableC50058M7w(C37581ov c37581ov, C29461bN c29461bN) {
        this.A01 = c29461bN;
        this.A00 = c37581ov;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Float valueOf;
        Long A0f;
        C1YP c1yp = this.A01.A01;
        C37581ov c37581ov = this.A00;
        Cursor A00 = C3EP.A00(c1yp, c37581ov, false);
        try {
            int A01 = AbstractC37601ox.A01(A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A012 = AbstractC37601ox.A01(A00, AbstractC111324zv.A00(5150));
            int A013 = AbstractC37601ox.A01(A00, "data");
            int A014 = AbstractC37601ox.A01(A00, "media_age");
            int A015 = AbstractC37601ox.A01(A00, "stored_age");
            int A016 = AbstractC37601ox.A01(A00, "item_type");
            ArrayList A11 = AbstractC43593JPy.A11(A00);
            while (A00.moveToNext()) {
                String string = A00.getString(A01);
                if (A00.isNull(A012)) {
                    valueOf = null;
                } else {
                    valueOf = Float.valueOf(A00.getFloat(A012));
                }
                byte[] blob = A00.getBlob(A013);
                if (A00.isNull(A014)) {
                    A0f = null;
                } else {
                    A0f = JQ0.A0f(A00, A014);
                }
                A11.add(new C108104tt(AbstractC108094ts.A00(A00.getString(A016)), valueOf, A0f, string, blob, A00.getLong(A015)));
            }
            return A11;
        } finally {
            A00.close();
            c37581ov.A00();
        }
    }
}
