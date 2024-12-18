package X;

import android.content.Context;

/* loaded from: classes6.dex */
public abstract class FTX {
    public static final G06 A00(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        return (G06) abstractC12990ll.A01(G06.class, new X32(abstractC12990ll, 47));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.FNM, java.lang.Object] */
    public static final void A01(Context context, android.net.Uri uri, AbstractC12990ll abstractC12990ll) {
        AbstractC167017dG.A1N(context, abstractC12990ll);
        if (!AbstractC31174DnI.A1U(uri, "native_flow")) {
            C0w9.A03("Checkpoint Uri", AnonymousClass001.A0R("Expect param native_flow = true in Uri but got Uri = ", uri.toString()));
        }
        String queryParameter = uri.getQueryParameter("api_path");
        String queryParameter2 = uri.getQueryParameter("challenge_context");
        ?? obj = new Object();
        obj.A00 = queryParameter;
        obj.A01 = queryParameter2;
        A00(abstractC12990ll).A02(context, obj);
    }
}
