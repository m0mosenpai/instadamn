package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.common.session.UserSession;
import java.util.Collection;

/* renamed from: X.Isa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42556Isa implements C97c {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public C42556Isa(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.C97c
    public final void Dh8(Collection collection) {
        C14360o3.A0B(collection, 0);
        if (!collection.isEmpty()) {
            UserSession userSession = this.A01;
            if (!C18U.A06(C06090Tz.A05, userSession, 36328151945723134L) && !C18U.A06(C06090Tz.A06, userSession, 36331012393747580L)) {
                return;
            }
        }
        C77453dV.A05.A09(this.A01, this.A00, ClipsPrefetchTriggerType.A04.A00);
    }
}
