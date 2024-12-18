package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jek, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44120Jek extends AbstractRunnableC14200nk {
    public final /* synthetic */ JUI A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44120Jek(JUI jui) {
        super(112, 3, false, false);
        this.A00 = jui;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.KzP] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.KzP, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        C47554KzP c47554KzP;
        JUI jui = this.A00;
        int i = 1;
        C11T.A05("This operation can't be run on UI thread.");
        String string = jui.A06.getString("quickRepliesCollection", null);
        if (string != null) {
            try {
                i = AbstractC44169JfY.parseFromJson(C16V.A00(string));
                c47554KzP = i;
                if (i == 0) {
                }
            } catch (IOException e) {
                C0w9.A05("quick_replies_deserialization", "failed to deserialize", i, e);
            }
            List list = c47554KzP.A01;
            list.getClass();
            C11T.A02(new RunnableC44121Jel(jui, c47554KzP.A00, AbstractC31172DnG.A19(list)));
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        ?? obj = new Object();
        obj.A01 = AbstractC166987dD.A1F(A1E);
        obj.A00 = "";
        c47554KzP = obj;
        List list2 = c47554KzP.A01;
        list2.getClass();
        C11T.A02(new RunnableC44121Jel(jui, c47554KzP.A00, AbstractC31172DnG.A19(list2)));
    }
}
