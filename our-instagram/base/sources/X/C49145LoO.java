package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LoO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49145LoO implements C7QB {
    public final /* synthetic */ C7ZT A00;

    public C49145LoO(C7ZT c7zt) {
        this.A00 = c7zt;
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void CzN(Object obj, Object obj2) {
        C7QY c7qy = (C7QY) obj2;
        if (c7qy != null) {
            DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
            String str = ((MessageIdentifier) directMessageIdentifier).A01;
            String str2 = c7qy.A0Y;
            if (str2 == null && (str2 = c7qy.A0T) == null) {
                C2EY Ar9 = c7qy.Ar9();
                if (Ar9 != null) {
                    str2 = Ar9.toString();
                } else {
                    return;
                }
            }
            if (str2 != null) {
                AbstractC43594JPz.A1K(c7qy, this.A00, directMessageIdentifier, str, str2);
            }
        }
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void D8a(Object obj) {
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void Dw5(Object obj) {
    }
}