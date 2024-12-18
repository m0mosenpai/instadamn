package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WwR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71574WwR implements Runnable {
    public final /* synthetic */ AnonymousClass436 A00;
    public final /* synthetic */ V17 A01;
    public final /* synthetic */ List A02;

    public RunnableC71574WwR(AnonymousClass436 anonymousClass436, V17 v17, List list) {
        this.A01 = v17;
        this.A00 = anonymousClass436;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2JS c2js;
        V17 v17 = this.A01;
        if (!v17.mDetached) {
            AnonymousClass436 anonymousClass436 = this.A00;
            if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && c2js.getCoercedBooleanField(0, AbstractC111324zv.A00(1377))) {
                UGc uGc = v17.A00;
                if (uGc != null) {
                    ImmutableList immutableList = uGc.A00;
                    List list = this.A02;
                    ArrayList arrayList = new ArrayList();
                    Iterator<E> it = immutableList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC25228BEl.A1Q(next, arrayList, AbstractC001800i.A0u(list, ((C2JS) next).getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)) ? 1 : 0);
                    }
                    if (!arrayList.isEmpty()) {
                        UGc uGc2 = v17.A00;
                        if (uGc2 != null) {
                            ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
                            C14360o3.A0B(copyOf, 0);
                            uGc2.A00 = copyOf;
                            uGc2.notifyDataSetChanged();
                            V17.A02(v17, false);
                            return;
                        }
                    } else {
                        FragmentActivity activity = v17.getActivity();
                        if (activity != null) {
                            AbstractC167017dG.A0y(activity, C3DN.A00);
                            return;
                        }
                        return;
                    }
                }
                C14360o3.A0F("itemAdapter");
                throw C00O.createAndThrow();
            }
            V17.A01(v17);
        }
    }
}
