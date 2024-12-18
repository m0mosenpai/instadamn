package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* renamed from: X.26k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C452726k implements InterfaceC449925e, InterfaceC452826l {
    public final UserSession A00;
    public final C26y A01;
    public final Queue A02;

    public C452726k(final UserSession userSession, int i) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = new EvictingQueue(i);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(new Object());
        if (C18U.A06(C06090Tz.A05, userSession, 2342161871143967353L)) {
            builder.add((Object) new InterfaceC453226p(userSession) { // from class: X.26s
                public final UserSession A00;

                @Override // X.InterfaceC453226p
                public final String ALT(AnonymousClass270 anonymousClass270) {
                    C1OW c1ow = anonymousClass270.A01;
                    if (c1ow != null && (c1ow instanceof AbstractC29011ae)) {
                        List C7R = ((AbstractC29011ae) c1ow).C7R();
                        C14360o3.A07(C7R);
                        DirectThreadKey directThreadKey = (DirectThreadKey) AbstractC001800i.A0O(C7R, 0);
                        if (directThreadKey != null && C7R.size() == 1) {
                            UserSession userSession2 = this.A00;
                            if (C18U.A06(C06090Tz.A05, userSession2, 2342161871143967353L) && AbstractC159387Cy.A00(userSession2, c1ow, directThreadKey) != EnumC159397Cz.A06) {
                                return AnonymousClass001.A0B("[INSTAMADILLO]");
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }

                {
                    this.A00 = userSession;
                }
            });
        }
        builder.add(new Object());
        builder.add(new Object());
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        this.A01 = new C26y(build);
        A00(this, new AnonymousClass270(null, null, null, null, null, null, "initialize", null, null));
    }

    @Override // X.InterfaceC452826l
    public final void D1t(C1OW c1ow) {
        C14360o3.A0B(c1ow, 0);
        A00(this, new AnonymousClass270(c1ow, null, null, null, null, null, "cancel", null, null));
    }

    @Override // X.InterfaceC452826l
    public final void D6x(C1OW c1ow) {
        C14360o3.A0B(c1ow, 0);
        A00(this, new AnonymousClass270(c1ow, null, null, null, null, null, "confirm", null, null));
    }

    @Override // X.InterfaceC452826l
    public final void DB8(C1OW c1ow, String str, boolean z) {
        C14360o3.A0B(c1ow, 0);
        A00(this, new AnonymousClass270(c1ow, null, Boolean.valueOf(z), null, null, null, "dispatch", null, str));
    }

    @Override // X.InterfaceC452826l
    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC452826l
    public final void DCa(C1OW c1ow) {
    }

    @Override // X.InterfaceC452826l
    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
        C14360o3.A0B(c1ow, 0);
        C14360o3.A0B(c19260xA, 2);
        A00(this, new AnonymousClass270(c1ow, null, null, Boolean.valueOf(z), null, null, "executing", null, null));
    }

    @Override // X.InterfaceC452826l
    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
        C14360o3.A0B(c1ow, 0);
        C14360o3.A0B(c19260xA, 3);
        A00(this, new AnonymousClass270(c1ow, c114675Fx, null, null, Boolean.valueOf(z), null, "failed", null, null));
        ((C452226f) this.A00.A01(C452226f.class, C452426h.A00)).A01.put(c1ow, c114675Fx);
    }

    @Override // X.InterfaceC452826l
    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
        C14360o3.A0B(c1ow, 0);
        A00(this, new AnonymousClass270(c1ow, null, null, null, null, null, "success", null, null));
    }

    @Override // X.InterfaceC452826l
    public final /* synthetic */ void Da4(String str, String str2, String str3) {
    }

    @Override // X.InterfaceC452826l
    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
    }

    @Override // X.InterfaceC452826l
    public final void DhF(C1OW c1ow, String str, boolean z) {
        C14360o3.A0B(c1ow, 0);
        A00(this, new AnonymousClass270(c1ow, null, Boolean.valueOf(z), null, null, null, "retry", null, str));
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        ImmutableList copyOf;
        C14360o3.A0B(context, 0);
        StringWriter stringWriter = new StringWriter();
        Queue queue = this.A02;
        synchronized (queue) {
            copyOf = ImmutableList.copyOf((Collection) queue);
        }
        Iterator<E> it = copyOf.iterator();
        while (it.hasNext()) {
            stringWriter.append((CharSequence) this.A01.A00((AnonymousClass270) it.next()));
            stringWriter.append('\n');
        }
        stringWriter.append((CharSequence) this.A01.A00(new AnonymousClass270(null, null, null, null, null, null, "rageshake", null, null)));
        stringWriter.append('\n');
        return stringWriter.toString();
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public static final void A00(C452726k c452726k, AnonymousClass270 anonymousClass270) {
        Queue queue = c452726k.A02;
        synchronized (queue) {
            queue.offer(anonymousClass270);
        }
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "DirectMutationLogCollector";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_mutation_manager";
    }
}
