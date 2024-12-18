package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.instagram.rtc.activity.RtcCallActivity;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.OpP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55756OpP implements InterfaceC08240bm {
    public final int A00;
    public final Object A01;

    public C55756OpP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC08240bm
    public final ArrayList BIr() {
        IntentFilter[] intentFilterArr;
        IntentFilter intentFilter;
        char c;
        int i;
        switch (this.A00) {
            case 0:
                intentFilterArr = new IntentFilter[1];
                i = 574;
                intentFilter = new IntentFilter(AbstractC43591JPw.A00(i));
                c = 0;
                intentFilterArr[c] = intentFilter;
                return AbstractC16960so.A1M(intentFilterArr);
            case 1:
                intentFilterArr = new IntentFilter[1];
                i = 573;
                intentFilter = new IntentFilter(AbstractC43591JPw.A00(i));
                c = 0;
                intentFilterArr[c] = intentFilter;
                return AbstractC16960so.A1M(intentFilterArr);
            case 2:
                intentFilterArr = new IntentFilter[2];
                intentFilterArr[0] = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter = new IntentFilter(AbstractC58317Pt9.A00(78));
                c = 1;
                intentFilterArr[c] = intentFilter;
                return AbstractC16960so.A1M(intentFilterArr);
            default:
                return AbstractC166987dD.A1F(Collections.singletonList(new IntentFilter("android.intent.action.SCREEN_ON")));
        }
    }

    @Override // X.InterfaceC08240bm
    public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        switch (this.A00) {
            case 0:
                CommonCdlProviderHolder commonCdlProviderHolder = (CommonCdlProviderHolder) this.A01;
                if (commonCdlProviderHolder.A05.compareAndSet(false, true) && commonCdlProviderHolder.cdlProviderInstance != null) {
                    synchronized (commonCdlProviderHolder) {
                        CdlProviderHolderRegistry cdlProviderHolderRegistry = commonCdlProviderHolder.A00;
                        if (cdlProviderHolderRegistry == null) {
                            C14360o3.A0F("cdlProviderHolderRegistry");
                        } else {
                            InterfaceC09390do interfaceC09390do = cdlProviderHolderRegistry.A01;
                            Iterator it = ((java.util.Set) AbstractC166987dD.A17(interfaceC09390do)).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (commonCdlProviderHolder.equals(((Reference) next).get())) {
                                        if (next != null) {
                                            ((java.util.Set) AbstractC166987dD.A17(interfaceC09390do)).remove(next);
                                        }
                                    }
                                }
                            }
                            if (((java.util.Set) AbstractC166987dD.A17(interfaceC09390do)).isEmpty()) {
                                WeakReference weakReference = cdlProviderHolderRegistry.A00.A00;
                                if (weakReference == null) {
                                    C14360o3.A0F("weakCdlProvider");
                                } else {
                                    weakReference.clear();
                                }
                            }
                            commonCdlProviderHolder.cdlProviderInstance = null;
                        }
                        throw C00O.createAndThrow();
                    }
                }
                C0QS c0qs = commonCdlProviderHolder.A01;
                if (c0qs != null) {
                    commonCdlProviderHolder.A02.getApplicationContext().unregisterReceiver(c0qs);
                }
                commonCdlProviderHolder.A01 = null;
                return;
            case 1:
                ((C55643OnT) this.A01).AP3();
                return;
            case 2:
                C14360o3.A0B(intent, 1);
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                int hashCode = action.hashCode();
                if (hashCode != -2128145023) {
                    if (hashCode != -1454123155 || !action.equals("android.intent.action.SCREEN_ON")) {
                        return;
                    }
                    OMR omr = ((RtcCallActivity) this.A01).A02;
                    if (omr != null) {
                        omr.A03(true);
                        return;
                    }
                } else {
                    if (!action.equals(AbstractC58317Pt9.A00(78))) {
                        return;
                    }
                    OMR omr2 = ((RtcCallActivity) this.A01).A02;
                    if (omr2 != null) {
                        omr2.A03(false);
                        return;
                    }
                }
                C14360o3.A0F("presenterBridge");
                throw C00O.createAndThrow();
            default:
                AbstractC167017dG.A1N(context, intent);
                if (C14360o3.A0K(intent.getAction(), "android.intent.action.SCREEN_ON") && ((KeyguardManager) MSZ.A0j(context)).isKeyguardLocked()) {
                    AbstractC166987dD.A1Y(this.A01);
                    return;
                }
                return;
        }
    }
}
