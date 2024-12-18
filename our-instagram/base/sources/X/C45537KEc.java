package X;

import com.instagram.direct.send.mutation.DirectConfigureAnimatedMediaMessageMutationProcessor;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* renamed from: X.KEc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45537KEc extends C1P1 {
    public final /* synthetic */ DirectConfigureAnimatedMediaMessageMutationProcessor A00;
    public final /* synthetic */ C31071eB A01;

    public C45537KEc(DirectConfigureAnimatedMediaMessageMutationProcessor directConfigureAnimatedMediaMessageMutationProcessor, C31071eB c31071eB) {
        this.A00 = directConfigureAnimatedMediaMessageMutationProcessor;
        this.A01 = c31071eB;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(512659459);
        int A032 = C0f9.A03(-439142785);
        DirectConfigureAnimatedMediaMessageMutationProcessor directConfigureAnimatedMediaMessageMutationProcessor = this.A00;
        C47Z A033 = ((PendingMediaStore) directConfigureAnimatedMediaMessageMutationProcessor.A03.getValue()).A03(this.A01.A04);
        if (A033 != null && A033.A53) {
            A033.A0Z(EnumC915447k.A02);
            ((PendingMediaStoreSerializer) directConfigureAnimatedMediaMessageMutationProcessor.A04.getValue()).A04();
        }
        C0f9.A0A(31436738, A032);
        C0f9.A0A(114562555, A03);
    }
}
