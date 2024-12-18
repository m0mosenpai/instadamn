package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* loaded from: classes8.dex */
public final class L6K {
    public final C7DL A00 = new C7DL();

    public final C46502Ki1 A00(DirectMessageIdentifier directMessageIdentifier) {
        boolean containsKey;
        C7DL c7dl = this.A00;
        synchronized (c7dl) {
            C14360o3.A0B(directMessageIdentifier, 0);
            containsKey = c7dl.A00.containsKey(C7DL.A00(c7dl, directMessageIdentifier));
        }
        if (containsKey) {
            Object A01 = c7dl.A01(directMessageIdentifier);
            A01.getClass();
            return (C46502Ki1) A01;
        }
        throw AbstractC31175DnJ.A0V("VideoViewState must exist for: ", directMessageIdentifier.toString());
    }
}
