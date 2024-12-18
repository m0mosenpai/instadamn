package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.45l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC913245l extends AbstractC913345m implements Serializable {
    public transient AnonymousClass182 A00;
    public transient ArrayList A01;
    public transient Map A02;

    public static IOException A00(AnonymousClass182 anonymousClass182, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String A09 = C914045z.A09(exc);
        if (A09 == null) {
            A09 = AnonymousClass001.A0g("[no message for ", exc.getClass().getName(), "]");
        }
        return new C102314j6(anonymousClass182, A09, exc);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.45l, X.45m] */
    public AbstractC913245l A0W(C45R c45r, C46D c46d) {
        return new AbstractC913345m(c45r, this, c46d);
    }

    public final void A0X(AnonymousClass182 anonymousClass182, Object obj) {
        this.A00 = anonymousClass182;
        try {
            if (obj == null) {
                super.A01.A0A(anonymousClass182, this, null);
                return;
            }
            Class<?> cls = obj.getClass();
            JsonSerializer A0J = A0J(null, cls, true);
            C45R c45r = this.A05;
            C913945y c913945y = ((C45S) c45r).A00;
            if (c913945y == null) {
                if (c45r.A0C(EnumC912645f.WRAP_ROOT_VALUE)) {
                    A01(anonymousClass182, A0J, ((C45S) c45r).A04.A00(c45r, cls), this, obj);
                    return;
                }
            } else if (!c913945y.A02()) {
                A01(anonymousClass182, A0J, c913945y, this, obj);
                return;
            }
            A0J.A0A(anonymousClass182, this, obj);
        } catch (Exception e) {
            throw A00(anonymousClass182, e);
        }
    }

    public static final void A01(AnonymousClass182 anonymousClass182, JsonSerializer jsonSerializer, C913945y c913945y, AbstractC913245l abstractC913245l, Object obj) {
        try {
            anonymousClass182.A0d();
            C45R c45r = abstractC913245l.A05;
            AnonymousClass165 anonymousClass165 = c913945y.A00;
            if (anonymousClass165 == null) {
                String str = c913945y.A02;
                if (c45r == null) {
                    anonymousClass165 = new AnonymousClass164(str);
                } else {
                    C45U c45u = C45T.A02;
                    anonymousClass165 = new AnonymousClass164(str);
                }
                c913945y.A00 = anonymousClass165;
            }
            anonymousClass182.A0l(anonymousClass165);
            jsonSerializer.A0A(anonymousClass182, abstractC913245l, obj);
            anonymousClass182.A0a();
        } catch (Exception e) {
            throw A00(anonymousClass182, e);
        }
    }
}
