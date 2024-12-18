package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public abstract class GFY implements InterfaceC169467hM {
    public final /* synthetic */ C31535DtK A00;

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x022f, code lost:
    
        if (r2 == X.EnumC31556Dtg.A09) goto L107;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x0208. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021f  */
    @Override // X.InterfaceC169477hN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1ON AN7(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFY.AN7(java.lang.String, java.lang.String):X.1ON");
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        String str2;
        InterfaceC40821up interfaceC40821up;
        String errorMessage;
        C14360o3.A0B(abstractC115105If, 1);
        C31535DtK c31535DtK = this.A00;
        C34672FPh c34672FPh = c31535DtK.A0G;
        if (c34672FPh == null) {
            str2 = "tailLoadPerfLogger";
        } else {
            int i = c34672FPh.A00;
            if (i != 0) {
                c34672FPh.A01.markerPoint(i, "request_failed");
                c34672FPh.A00((short) 3);
            }
            C31543DtT c31543DtT = c31535DtK.A0J;
            str2 = "paginationHelper";
            if (c31543DtT != null) {
                c31543DtT.A01 = true;
                c31535DtK.A0e = false;
                if (AbstractC167007dF.A1W(c31543DtT.A00)) {
                    C31542DtS c31542DtS = c31535DtK.A0E;
                    if (c31542DtS == null) {
                        str2 = "followListAdapter";
                    } else {
                        C0fA.A00(c31542DtS, 2041272882);
                    }
                }
                String A0m = AbstractC31173DnH.A0m(c31535DtK);
                if (abstractC115105If instanceof C115115Ig) {
                    Object obj = ((C115115Ig) abstractC115105If).A00;
                    if ((obj instanceof InterfaceC40821up) && (interfaceC40821up = (InterfaceC40821up) obj) != null && (errorMessage = interfaceC40821up.getErrorMessage()) != null && errorMessage.length() != 0) {
                        A0m = errorMessage;
                    }
                }
                FragmentActivity activity = c31535DtK.getActivity();
                if (activity != null && !activity.isFinishing()) {
                    C9GR.A03(c31535DtK.getActivity(), A0m, "UserList onRequestFail", 1);
                } else {
                    C0w9.A03(AbstractC111324zv.A00(590), AbstractC111324zv.A00(709));
                }
                C32123E9w c32123E9w = c31535DtK.A0I;
                if (c32123E9w == null) {
                    str2 = "perfLogger";
                } else {
                    ((MTJ) c32123E9w).A00.A07(A0m);
                    C69613Av A02 = C31535DtK.A02(c31535DtK);
                    if (A02 != null) {
                        A02.A07(A0m);
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
        C14360o3.A0B(str, 0);
        C31535DtK c31535DtK = this.A00;
        C34672FPh c34672FPh = c31535DtK.A0G;
        if (c34672FPh == null) {
            C14360o3.A0F("tailLoadPerfLogger");
            throw C00O.createAndThrow();
        }
        int i = c34672FPh.A00;
        if (i != 0) {
            c34672FPh.A01.markerPoint(i, "request_finished");
        }
        C31535DtK.A0H(c31535DtK, str);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    public GFY(C31535DtK c31535DtK) {
        this.A00 = c31535DtK;
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
        String str2;
        InterfaceC70513Em interfaceC70513Em;
        C31535DtK c31535DtK = this.A00;
        C34672FPh c34672FPh = c31535DtK.A0G;
        if (c34672FPh == null) {
            str2 = "tailLoadPerfLogger";
        } else {
            int i = c34672FPh.A00;
            if (i != 0) {
                c34672FPh.A01.markerPoint(i, "request_dropped");
                c34672FPh.A00((short) 216);
            }
            if (C31535DtK.A0R(c31535DtK) && (interfaceC70513Em = c31535DtK.A0A) != null) {
                interfaceC70513Em.setIsLoading(false);
            }
            C32123E9w c32123E9w = c31535DtK.A0I;
            if (c32123E9w == null) {
                str2 = "perfLogger";
            } else {
                ((MTJ) c32123E9w).A00.A03();
                C69613Av A02 = C31535DtK.A02(c31535DtK);
                if (A02 != null) {
                    A02.A03();
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
        String str2;
        C31535DtK c31535DtK = this.A00;
        C34672FPh c34672FPh = c31535DtK.A0G;
        if (c34672FPh == null) {
            str2 = "tailLoadPerfLogger";
        } else {
            int i = c34672FPh.A00;
            if (i != 0) {
                c34672FPh.A01.markerPoint(i, AbstractC111324zv.A00(3017));
            }
            C32123E9w c32123E9w = c31535DtK.A0I;
            if (c32123E9w == null) {
                str2 = "perfLogger";
            } else {
                ((MTJ) c32123E9w).A00.A04();
                C69613Av A02 = C31535DtK.A02(c31535DtK);
                if (A02 != null) {
                    A02.A04();
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC169467hM
    public final C1GL BqZ() {
        return this.A00;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}
