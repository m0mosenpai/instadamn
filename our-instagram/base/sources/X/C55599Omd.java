package X;

import com.facebook.ale.p000native.AvatarLiveEditingNotificationDelegate;
import java.util.Iterator;

/* renamed from: X.Omd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55599Omd implements AvatarLiveEditingNotificationDelegate {
    public final /* synthetic */ C54499O6b A00;

    @Override // com.facebook.ale.p000native.AvatarLiveEditingNotificationDelegate
    public final synchronized void onAvatarGenerationBegin(String str) {
        C14360o3.A0B(str, 0);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC57896Pm0) it.next()).Cyd(new C51399Mn7(str));
        }
    }

    @Override // com.facebook.ale.p000native.AvatarLiveEditingNotificationDelegate
    public final synchronized void onAvatarGenerationEnd(boolean z, String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC57896Pm0) it.next()).Cyd(new C51406MnE(AbstractC72525Xfe.A00(str2), str, str3, z));
        }
    }

    @Override // com.facebook.ale.p000native.AvatarLiveEditingNotificationDelegate
    public final synchronized void onAvatarParametersUpdateBegin(String str) {
        C14360o3.A0B(str, 0);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC57896Pm0) it.next()).Cyd(new C51400Mn8(str));
        }
    }

    @Override // com.facebook.ale.p000native.AvatarLiveEditingNotificationDelegate
    public final synchronized void onAvatarParametersUpdateEnd(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC57896Pm0) it.next()).Cyd(new C51403MnB(str, AbstractC72525Xfe.A00(str2)));
        }
    }

    @Override // com.facebook.ale.p000native.AvatarLiveEditingNotificationDelegate
    public final synchronized void onAvatarRenderUpdateBegin(String str) {
        C14360o3.A0B(str, 0);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC57896Pm0) it.next()).Cyd(new C51401Mn9(str));
        }
    }

    @Override // com.facebook.ale.p000native.AvatarLiveEditingNotificationDelegate
    public final synchronized void onAvatarRenderUpdateEnd(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC57896Pm0) it.next()).Cyd(new C51404MnC(str, AbstractC72525Xfe.A00(str2)));
        }
    }

    @Override // com.facebook.ale.p000native.AvatarLiveEditingNotificationDelegate
    public final synchronized void onAvatarUpdateBegin(String str) {
        C14360o3.A0B(str, 0);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC57896Pm0) it.next()).Cyd(new C51402MnA(str));
        }
    }

    @Override // com.facebook.ale.p000native.AvatarLiveEditingNotificationDelegate
    public final synchronized void onAvatarUpdateEnd(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC57896Pm0) it.next()).Cyd(new C51405MnD(str, AbstractC72525Xfe.A00(str2)));
        }
    }

    public C55599Omd(C54499O6b c54499O6b) {
        this.A00 = c54499O6b;
    }
}
