package X;

import com.facebook.tigon.tigonobserver.TigonRequestAdded;
import com.facebook.tigon.tigonobserver.TigonRequestErrored;
import com.facebook.tigon.tigonobserver.TigonRequestResponse;
import com.facebook.tigon.tigonobserver.TigonRequestStarted;
import com.facebook.tigon.tigonobserver.TigonRequestSucceeded;

/* renamed from: X.1G7, reason: invalid class name */
/* loaded from: classes.dex */
public interface C1G7 {
    void Cvo(TigonRequestAdded tigonRequestAdded);

    void DCj(TigonRequestSucceeded tigonRequestSucceeded);

    void DEC(TigonRequestErrored tigonRequestErrored);

    void Dgf(TigonRequestResponse tigonRequestResponse);

    void DoJ(TigonRequestStarted tigonRequestStarted);

    void E23(TigonRequestErrored tigonRequestErrored);
}
