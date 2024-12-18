package com.google.android.gms.internal.p002authapi;

import X.AbstractC1335861e;
import X.AbstractC167007dF;
import X.AbstractC31175DnJ;
import X.AbstractC43592JPx;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC60658RGk;
import X.AbstractC63093Sct;
import X.AbstractC63257SgF;
import X.C0f9;
import X.C3U5;
import X.C60657RGj;
import X.C61Q;
import X.C61W;
import X.C61Z;
import X.C61j;
import X.C62679SLs;
import X.C62938SYg;
import X.C63094Scu;
import X.C63215SfL;
import X.RGV;
import X.RunnableC64724TRg;
import X.S2N;
import X.S2O;
import X.SA2;
import X.T4o;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbh;
import com.google.android.gms.auth.api.signin.internal.zbj;
import com.google.android.gms.auth.api.signin.internal.zbq;
import com.google.android.gms.auth.api.signin.internal.zbt;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes10.dex */
public abstract class zbb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(1375053497, C0f9.A03(1901617163));
        return this;
    }

    public zbb(String str) {
        int A03 = C0f9.A03(-288759801);
        attachInterface(this, str);
        C0f9.A0A(-1964760975, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x0273. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.RGV, X.61Q] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, X.61b] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        int A032;
        UnsupportedOperationException A11;
        int i3;
        int A033;
        int i4;
        boolean z;
        int i5;
        int A034;
        int i6;
        BasePendingResult A07;
        int i7;
        int i8;
        int A035 = C0f9.A03(-1821738767);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i8 = -1380969112;
                C0f9.A0A(i8, A035);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        if (this instanceof zbr) {
            zbr zbrVar = (zbr) this;
            int A036 = C0f9.A03(-481026318);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        C0f9.A0A(-327185802, A036);
                        z = false;
                    } else {
                        AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                        parcel.readString();
                        C63094Scu.A00(parcel);
                        A032 = C0f9.A03(-1337636334);
                        A11 = AbstractC43592JPx.A11();
                        i3 = -947469640;
                        C0f9.A0A(i3, A032);
                        throw A11;
                    }
                } else {
                    Status status = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                    C63094Scu.A00(parcel);
                    zbrVar.FFI(status);
                    parcel2.writeNoException();
                    C0f9.A0A(-320535190, A036);
                    z = true;
                }
            } else {
                Status status2 = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                Credential credential = (Credential) AbstractC58320PtC.A0F(parcel, Credential.CREATOR);
                C63094Scu.A00(parcel);
                if (zbrVar instanceof zbf) {
                    int A037 = C0f9.A03(1695798971);
                    ((zbf) zbrVar).A00.A06(new T4o(credential, status2));
                    C0f9.A0A(-2089579501, A037);
                    parcel2.writeNoException();
                    C0f9.A0A(-320535190, A036);
                    z = true;
                } else {
                    A032 = C0f9.A03(2033397653);
                    A11 = AbstractC43592JPx.A11();
                    i3 = 1433453172;
                    C0f9.A0A(i3, A032);
                    throw A11;
                }
            }
            i8 = 1020434458;
        } else {
            if (this instanceof zbbe) {
                zbbe zbbeVar = (zbbe) this;
                A03 = C0f9.A03(658063777);
                z = true;
                if (i == 1) {
                    Status status3 = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                    Parcelable A0F = AbstractC58320PtC.A0F(parcel, PendingIntent.CREATOR);
                    C63094Scu.A00(parcel);
                    int A038 = C0f9.A03(-1397707610);
                    S2N.A00(status3, zbbeVar.A00, A0F);
                    C0f9.A0A(1144875443, A038);
                    i5 = -1347464988;
                } else {
                    z = false;
                    i5 = -2064238166;
                }
            } else if (this instanceof zbbc) {
                zbbc zbbcVar = (zbbc) this;
                A03 = C0f9.A03(-1053139073);
                z = true;
                if (i == 1) {
                    Status status4 = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                    Parcelable A0F2 = AbstractC58320PtC.A0F(parcel, BeginSignInResult.CREATOR);
                    C63094Scu.A00(parcel);
                    int A039 = C0f9.A03(-1739888677);
                    S2N.A00(status4, zbbcVar.A00, A0F2);
                    C0f9.A0A(-795672994, A039);
                    i5 = 588549441;
                } else {
                    z = false;
                    i5 = 1433290209;
                }
            } else if (this instanceof zbav) {
                zbav zbavVar = (zbav) this;
                A03 = C0f9.A03(-105227220);
                z = true;
                if (i == 1) {
                    Status status5 = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                    Parcelable A0F3 = AbstractC58320PtC.A0F(parcel, SavePasswordResult.CREATOR);
                    C63094Scu.A00(parcel);
                    int A0310 = C0f9.A03(1307021760);
                    S2N.A00(status5, zbavVar.A00, A0F3);
                    C0f9.A0A(1044939695, A0310);
                    i5 = -1878995898;
                } else {
                    z = false;
                    i5 = -283376372;
                }
            } else if (this instanceof zbap) {
                zbap zbapVar = (zbap) this;
                A03 = C0f9.A03(1413163608);
                z = true;
                if (i == 1) {
                    Status status6 = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                    Parcelable A0F4 = AbstractC58320PtC.A0F(parcel, AuthorizationResult.CREATOR);
                    C63094Scu.A00(parcel);
                    int A0311 = C0f9.A03(-1143698030);
                    if (status6.A00 <= 0) {
                        zbapVar.A00.A01(A0F4);
                        i7 = 348191541;
                    } else {
                        zbapVar.A00.A00(S2O.A00(status6));
                        i7 = -1340813322;
                    }
                    C0f9.A0A(i7, A0311);
                    i5 = -576073987;
                } else {
                    z = false;
                    i5 = -552336575;
                }
            } else if (this instanceof zbt) {
                zbt zbtVar = (zbt) this;
                A03 = C0f9.A03(972203475);
                z = true;
                if (i != 1) {
                    if (i != 2) {
                        z = false;
                        i5 = 1103574563;
                    } else {
                        A034 = C0f9.A03(-1912087391);
                        zbt.A00(zbtVar);
                        C62938SYg.A00(zbtVar.A00).A01();
                        i6 = -387719590;
                    }
                } else {
                    A034 = C0f9.A03(-1908095713);
                    zbt.A00(zbtVar);
                    Context context = zbtVar.A00;
                    C63215SfL A00 = C63215SfL.A00(context);
                    GoogleSignInAccount A01 = A00.A01();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.A0C;
                    if (A01 != null) {
                        googleSignInOptions = A00.A02();
                    }
                    C3U5.A02(googleSignInOptions);
                    C61W c61w = SA2.A05;
                    ?? c61q = new C61Q(context, googleSignInOptions, c61w, new C61Z(Looper.getMainLooper(), new Object()));
                    if (A01 != null) {
                        AbstractC1335861e abstractC1335861e = c61q.A05;
                        Context context2 = c61q.A01;
                        boolean A1P = AbstractC167007dF.A1P(RGV.A02(c61q), 3);
                        C62679SLs c62679SLs = AbstractC63257SgF.A00;
                        String A0312 = C63215SfL.A00(context2).A03("refreshToken");
                        AbstractC63257SgF.A02(context2);
                        if (A1P) {
                            C62679SLs c62679SLs2 = RunnableC64724TRg.A02;
                            if (A0312 == null) {
                                C61j status7 = new Status(4, null);
                                C3U5.A08(!AbstractC31175DnJ.A1S(status7.C0F().A00), "Status code must not be SUCCESS");
                                A07 = new C60657RGj(status7);
                                A07.A06(status7);
                            } else {
                                RunnableC64724TRg runnableC64724TRg = new RunnableC64724TRg(A0312);
                                new Thread(runnableC64724TRg).start();
                                A07 = runnableC64724TRg.A00;
                            }
                        } else {
                            A07 = abstractC1335861e.A07(new AbstractC60658RGk(c61w, abstractC1335861e));
                        }
                        AbstractC63093Sct.A00(A07);
                        i6 = 659214002;
                    } else {
                        c61q.A03();
                        i6 = 1456626855;
                    }
                }
                C0f9.A0A(i6, A034);
                i5 = -711435128;
            } else {
                zbq zbqVar = (zbq) this;
                A03 = C0f9.A03(1245419149);
                switch (i) {
                    case 101:
                        AbstractC58320PtC.A0F(parcel, GoogleSignInAccount.CREATOR);
                        AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                        C63094Scu.A00(parcel);
                        A032 = C0f9.A03(2092295690);
                        A11 = AbstractC43592JPx.A11();
                        i3 = -997480892;
                        C0f9.A0A(i3, A032);
                        throw A11;
                    case 102:
                        Status status8 = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                        C63094Scu.A00(parcel);
                        if (zbqVar instanceof zbh) {
                            A033 = C0f9.A03(-503809526);
                            ((zbh) zbqVar).A00.A06(status8);
                            i4 = -1113135254;
                            C0f9.A0A(i4, A033);
                            parcel2.writeNoException();
                            z = true;
                            i5 = 1282656160;
                            break;
                        } else {
                            A032 = C0f9.A03(1701392226);
                            A11 = AbstractC43592JPx.A11();
                            i3 = 779169576;
                            C0f9.A0A(i3, A032);
                            throw A11;
                        }
                    case 103:
                        Status status9 = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
                        C63094Scu.A00(parcel);
                        if (zbqVar instanceof zbj) {
                            A033 = C0f9.A03(1723800271);
                            ((zbj) zbqVar).A00.A06(status9);
                            i4 = 2001136544;
                            C0f9.A0A(i4, A033);
                            parcel2.writeNoException();
                            z = true;
                            i5 = 1282656160;
                            break;
                        } else {
                            A032 = C0f9.A03(420049894);
                            A11 = AbstractC43592JPx.A11();
                            i3 = 981600391;
                            C0f9.A0A(i3, A032);
                            throw A11;
                        }
                    default:
                        z = false;
                        i5 = 69625722;
                        break;
                }
            }
            C0f9.A0A(i5, A03);
            i8 = 1020434458;
        }
        C0f9.A0A(i8, A035);
        return z;
    }
}
