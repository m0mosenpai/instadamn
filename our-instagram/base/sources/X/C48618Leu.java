package X;

import android.content.ContentResolver;
import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Leu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48618Leu implements InterfaceC50449MPd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Medium A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C8Y3 A03;

    public C48618Leu(Context context, Medium medium, UserSession userSession, C8Y3 c8y3) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = medium;
        this.A03 = c8y3;
    }

    @Override // X.InterfaceC50449MPd
    public final void Dq9(File file) {
        try {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C47294Kv5 c47294Kv5 = new C47294Kv5(this.A03);
            Medium medium = this.A01;
            String str = medium.A0G.A03;
            String str2 = medium.A0N;
            long currentTimeMillis = System.currentTimeMillis();
            String absolutePath = file.getAbsolutePath();
            C14360o3.A07(absolutePath);
            Medium medium2 = new Medium(android.net.Uri.fromFile(file), absolutePath, 0, 1, 0, 0, AbstractC166987dD.A0L(currentTimeMillis), currentTimeMillis);
            medium2.A0G.A03 = str;
            medium2.A0N = str2;
            ContentResolver contentResolver = context.getContentResolver();
            C14360o3.A07(contentResolver);
            C11T.A02(new M3O(c47294Kv5, (C183978Ee) new C9MV(contentResolver, context, medium2, userSession, C05F.A00).call()));
        } catch (Exception e) {
            AbstractC12120kG.A0I("unable to create platform sticker background input file", e, AbstractC06930Yk.A0E());
            C11T.A02(new M3N(this.A03, e));
        }
    }

    @Override // X.InterfaceC50449MPd
    public final void onFailure(Exception exc) {
        this.A03.A00(exc);
    }
}
