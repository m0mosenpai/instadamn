package X;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.M6m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50023M6m implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ android.net.Uri A01;
    public final /* synthetic */ AbstractC10360h2 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public RunnableC50023M6m(Intent intent, android.net.Uri uri, AbstractC10360h2 abstractC10360h2, String str, String str2) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = intent;
        this.A01 = uri;
        this.A02 = abstractC10360h2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A04;
        String str2 = this.A03;
        String type = this.A00.getType();
        android.net.Uri uri = this.A01;
        C45358K5r c45358K5r = new C45358K5r();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A0b.putString("external_shared_text", str2);
        A0b.putString("share_type", type);
        A0b.putParcelable("external_uri", uri);
        c45358K5r.setArguments(A0b);
        c45358K5r.A0B(this.A02, "external_share_sheet_intent_handler_activity");
    }
}
