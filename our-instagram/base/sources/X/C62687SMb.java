package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.SMb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62687SMb {
    public C0QL A00;
    public boolean A01;
    public final Context A02;
    public final AbstractC61578Rq2 A03;
    public final C62562SGn A04;
    public final List A05;

    public final void A00() {
        C0QL c0ql = this.A00;
        if (c0ql != null) {
            try {
                this.A02.unregisterReceiver(c0ql);
            } catch (IllegalArgumentException unused) {
                this.A03.A00("client_flashcall_unregister_error", null);
            }
            this.A00 = null;
        }
    }

    public C62687SMb(Context context, AbstractC61578Rq2 abstractC61578Rq2, C62562SGn c62562SGn, String[] strArr) {
        this.A02 = context;
        ArrayList A17 = AbstractC25225BEi.A17(strArr.length);
        for (String str : strArr) {
            A17.add(Pattern.compile(str));
        }
        this.A05 = A17;
        this.A04 = c62562SGn;
        this.A03 = abstractC61578Rq2;
    }
}
