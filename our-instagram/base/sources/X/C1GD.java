package X;

import com.facebook.tigon.tigonobserver.TigonRequestAdded;
import com.facebook.tigon.tigonobserver.TigonRequestErrored;
import com.facebook.tigon.tigonobserver.TigonRequestResponse;
import com.facebook.tigon.tigonobserver.TigonRequestStarted;
import com.facebook.tigon.tigonobserver.TigonRequestSucceeded;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1GD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GD implements C1G7 {
    public static final C1GD A00 = new Object();
    public static final CopyOnWriteArraySet A01 = new CopyOnWriteArraySet();

    @Override // X.C1G7
    public final void Cvo(TigonRequestAdded tigonRequestAdded) {
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            ((C1G7) it.next()).Cvo(tigonRequestAdded);
        }
    }

    @Override // X.C1G7
    public final void DCj(TigonRequestSucceeded tigonRequestSucceeded) {
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            ((C1G7) it.next()).DCj(tigonRequestSucceeded);
        }
    }

    @Override // X.C1G7
    public final void DEC(TigonRequestErrored tigonRequestErrored) {
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            ((C1G7) it.next()).DEC(tigonRequestErrored);
        }
    }

    @Override // X.C1G7
    public final void Dgf(TigonRequestResponse tigonRequestResponse) {
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            ((C1G7) it.next()).Dgf(tigonRequestResponse);
        }
    }

    @Override // X.C1G7
    public final void DoJ(TigonRequestStarted tigonRequestStarted) {
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            ((C1G7) it.next()).DoJ(tigonRequestStarted);
        }
    }

    @Override // X.C1G7
    public final void E23(TigonRequestErrored tigonRequestErrored) {
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            ((C1G7) it.next()).E23(tigonRequestErrored);
        }
    }
}
