package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class SYS {
    public static final AtomicBoolean A02 = AbstractC166997dE.A17();
    public final C11850jk A00;
    public final C11840jj A01;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final void A00(String str, String str2, String str3) {
        C40701ud A00;
        InterfaceC48192Ji interfaceC48192Ji;
        InterfaceC48212Jk interfaceC48212Jk;
        final int i = 0;
        if (!this.A00.A00.A01.getBoolean("PHONEID_APP_DEVICEID_SYNCED", false) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            final int i2 = 1;
            if (A02.compareAndSet(false, true)) {
                C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "family_device_id");
                C0CA.A00(A0T, str3, PublicKeyCredentialControllerUtility.JSON_KEY_APPID);
                C0CA.A00(A0T, str2, "app_scoped_id");
                try {
                    C64054SyQ c64054SyQ = (C64054SyQ) AbstractC50523MSb.A0R("create", SRP.class);
                    AbstractC31173DnH.A1M(A0T, c64054SyQ.A00.A00, "input");
                    c64054SyQ.A01 = true;
                    PandoGraphQLRequest build = c64054SyQ.build();
                    C11840jj c11840jj = this.A01;
                    final ?? obj = new Object();
                    AbstractC12990ll abstractC12990ll = c11840jj.A00;
                    if (abstractC12990ll instanceof UserSession) {
                        A00 = AbstractC40691uc.A01((UserSession) abstractC12990ll);
                        C14360o3.A0A(build);
                        interfaceC48192Ji = new InterfaceC48192Ji(obj, i) { // from class: X.0Qf
                            public final int A00;
                            public final Object A01;

                            {
                                this.A00 = i;
                                this.A01 = obj;
                            }

                            @Override // X.InterfaceC48192Ji
                            public final void invoke(AnonymousClass436 anonymousClass436) {
                                ((AbstractC25011Ke) this.A01).set(anonymousClass436);
                            }
                        };
                        interfaceC48212Jk = new InterfaceC48212Jk(obj, i) { // from class: X.0pH
                            public final int A00;
                            public final Object A01;

                            {
                                this.A00 = i;
                                this.A01 = obj;
                            }

                            @Override // X.InterfaceC48212Jk
                            public final void invoke(Throwable th) {
                                ((AbstractC25011Ke) this.A01).setException(th);
                            }
                        };
                    } else {
                        C14360o3.A0C(abstractC12990ll, "null cannot be cast to non-null type com.instagram.common.session.LoggedOutSession");
                        A00 = AbstractC40691uc.A00((C07270a1) abstractC12990ll);
                        C14360o3.A0A(build);
                        interfaceC48192Ji = new InterfaceC48192Ji(obj, i2) { // from class: X.0Qf
                            public final int A00;
                            public final Object A01;

                            {
                                this.A00 = i2;
                                this.A01 = obj;
                            }

                            @Override // X.InterfaceC48192Ji
                            public final void invoke(AnonymousClass436 anonymousClass436) {
                                ((AbstractC25011Ke) this.A01).set(anonymousClass436);
                            }
                        };
                        interfaceC48212Jk = new InterfaceC48212Jk(obj, i2) { // from class: X.0pH
                            public final int A00;
                            public final Object A01;

                            {
                                this.A00 = i2;
                                this.A01 = obj;
                            }

                            @Override // X.InterfaceC48212Jk
                            public final void invoke(Throwable th) {
                                ((AbstractC25011Ke) this.A01).setException(th);
                            }
                        };
                    }
                    A00.ATV(interfaceC48212Jk, interfaceC48192Ji, build);
                    C2OD.A03(new T8G(this, 3), obj, C1M8.A01);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw AbstractC58318PtA.A0f(e);
                }
            }
        }
    }

    public SYS(C11840jj c11840jj, C11850jk c11850jk) {
        this.A00 = c11850jk;
        this.A01 = c11840jj;
    }
}
