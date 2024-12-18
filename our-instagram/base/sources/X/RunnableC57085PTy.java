package X;

import android.content.Intent;
import com.instagram.share.handleractivity.CustomStoryShareHandlerActivity;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.PTy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57085PTy implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ android.net.Uri A03;
    public final /* synthetic */ android.net.Uri A04;
    public final /* synthetic */ C45123Jxs A05;
    public final /* synthetic */ AbstractC12990ll A06;
    public final /* synthetic */ CustomStoryShareHandlerActivity A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ HashMap A09;

    public RunnableC57085PTy(Intent intent, android.net.Uri uri, android.net.Uri uri2, C45123Jxs c45123Jxs, AbstractC12990ll abstractC12990ll, CustomStoryShareHandlerActivity customStoryShareHandlerActivity, String str, HashMap hashMap, int i, int i2) {
        this.A07 = customStoryShareHandlerActivity;
        this.A06 = abstractC12990ll;
        this.A02 = intent;
        this.A04 = uri;
        this.A03 = uri2;
        this.A05 = c45123Jxs;
        this.A08 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A09 = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomStoryShareHandlerActivity customStoryShareHandlerActivity = this.A07;
        AbstractC12990ll abstractC12990ll = this.A06;
        Intent intent = this.A02;
        List A1J = AbstractC166987dD.A1J(this.A04);
        android.net.Uri uri = this.A03;
        C45123Jxs c45123Jxs = this.A05;
        String str = this.A08;
        int i = this.A01;
        int i2 = this.A00;
        AbstractC54202Nxg.A00(customStoryShareHandlerActivity, intent, uri, c45123Jxs, abstractC12990ll, new PON(customStoryShareHandlerActivity), str, this.A09, A1J, i, i2);
    }
}
