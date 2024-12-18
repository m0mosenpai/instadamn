package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.os.CancellationSignal;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.appreciation.mediasettings.AppreciationMediaSettingsApi;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* loaded from: classes9.dex */
public final class PYp extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06 = 0;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final String A0A;
    public final String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYp(C50650MXp c50650MXp, InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, Boolean bool, Boolean bool2, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = c50650MXp;
        this.A07 = interfaceC11380iw;
        this.A0B = str;
        this.A0A = str2;
        this.A01 = c38321qM;
        this.A09 = bool;
        this.A08 = bool2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A06 != 0) {
            NIW niw = (NIW) this.A09;
            String str = this.A0A;
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A08;
            PYp pYp = new PYp(niw, str, this.A0B, interfaceC23621Ds, (InterfaceC16820sZ) this.A07, interfaceC16620sF, this.A05);
            pYp.A01 = obj;
            return pYp;
        }
        PYp pYp2 = new PYp((C50650MXp) this.A04, (InterfaceC11380iw) this.A07, (C38321qM) this.A01, (Boolean) this.A09, (Boolean) this.A08, this.A0B, this.A0A, interfaceC23621Ds);
        pYp2.A02 = obj;
        return pYp2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v14, types: [X.0sl] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC19960yQ interfaceC19960yQ;
        LLN lln;
        boolean A04;
        Object A0h;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        NIW niw;
        String str;
        Object obj2;
        String str2;
        String str3;
        ?? A1E;
        C3NY c3ny;
        Object obj3 = obj;
        if (this.A06 != 0) {
            C1JX c1jx = C1JX.A02;
            int i = this.A00;
            try {
                if (i != 0) {
                    if (i == 1) {
                        str2 = (String) this.A04;
                        obj2 = this.A03;
                        str = (String) this.A02;
                        niw = (NIW) this.A01;
                        AbstractC09560e7.A00(obj3);
                    } else {
                        throw AbstractC166987dD.A13();
                    }
                } else {
                    AbstractC09560e7.A00(obj3);
                    niw = (NIW) this.A09;
                    C2PX c2px = niw.A07;
                    str = this.A0A;
                    TreeMap treeMap = C37581ov.A08;
                    C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM audio_amplitudes WHERE audio_asset_id = ?", 1);
                    A00.ADp(1, str);
                    C1YP c1yp = c2px.A00;
                    c1yp.assertNotSuspendingTransaction();
                    c1yp.beginTransaction();
                    OA7 oa7 = null;
                    try {
                        Cursor query = c1yp.query(A00, (CancellationSignal) null);
                        try {
                            int A01 = AbstractC37601ox.A01(query, "audio_asset_id");
                            int A012 = AbstractC37601ox.A01(query, "audio_amplitudes_list");
                            int A013 = AbstractC37601ox.A01(query, "last_used_time_ms");
                            if (query.moveToFirst()) {
                                String string = query.getString(A01);
                                String string2 = query.getString(A012);
                                C14360o3.A0B(string2, 0);
                                if (string2.equals("")) {
                                    A1E = C16930sl.A00;
                                } else {
                                    List A0R = AbstractC001900j.A0R(string2, new String[]{"␞"}, 0);
                                    A1E = AbstractC166987dD.A1E();
                                    Iterator it = A0R.iterator();
                                    while (it.hasNext()) {
                                        try {
                                            Float A0n = AnonymousClass010.A0n(AbstractC166987dD.A1B(it));
                                            if (A0n != null) {
                                                A1E.add(A0n);
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                                oa7 = new OA7(query.getLong(A013), string, A1E);
                            }
                            c1yp.setTransactionSuccessful();
                            if (oa7 != null) {
                                Object obj4 = this.A08;
                                String str4 = this.A0B;
                                ClipsCreationViewModel clipsCreationViewModel = niw.A04;
                                List list = oa7.A02;
                                C14360o3.A0B(str, 0);
                                clipsCreationViewModel.A0K.A04.A05(str, list);
                                AbstractC23641Du.A05(C12L.A00.A04, new JXO(obj4, oa7, str4, null, 8), AbstractC141776au.A00(niw));
                                c2px.A00(new OA7(System.currentTimeMillis(), str, list));
                            } else {
                                boolean z = this.A05;
                                Object obj5 = this.A07;
                                obj2 = this.A08;
                                str2 = this.A0B;
                                AbstractC23641Du.A05(C12L.A00.A04, new PYX(obj5, null, 27), AbstractC141776au.A00(niw));
                                UserSession userSession = ((AbstractC50863Mdu) niw).A00;
                                boolean A1M = AbstractC167007dF.A1M(z ? 1 : 0);
                                C14360o3.A0B(str, 1);
                                Locale locale = Locale.US;
                                if (A1M) {
                                    str3 = "music/track/%s/oa_amplitudes/";
                                } else {
                                    str3 = "music/track/%s/amplitudes/";
                                }
                                String format = String.format(locale, str3, Arrays.copyOf(new Object[]{str}, 1));
                                C14360o3.A07(format);
                                C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                                A0M.A0E = format;
                                A0M.A9s("product", AbstractC65993Txo.A00(MusicProduct.A06));
                                A0M.A0P(null, C32162EBj.class, FW2.class, false);
                                A0M.A04();
                                A0M.A0A = format;
                                C1ON A0N = A0M.A0N();
                                this.A01 = niw;
                                this.A02 = str;
                                this.A03 = obj2;
                                this.A04 = str2;
                                this.A00 = 1;
                                obj3 = A0N.A00(352652612, this);
                                if (obj3 == c1jx) {
                                    return c1jx;
                                }
                            }
                        } finally {
                            query.close();
                            A00.A00();
                        }
                    } finally {
                        c1yp.endTransaction();
                    }
                }
                C3NY c3ny2 = (C3NY) obj3;
                if (c3ny2 instanceof C3NX) {
                    List list2 = ((C32162EBj) ((C3NX) c3ny2).A00).A00;
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    int size = list2.size();
                    float f = 1.0f;
                    float f2 = 0.0f;
                    for (int i2 = 0; i2 < size; i2++) {
                        if (AbstractC167007dF.A04(list2, i2) > f2) {
                            f2 = AbstractC167007dF.A04(list2, i2);
                        }
                        if (AbstractC167007dF.A04(list2, i2) < f) {
                            f = AbstractC167007dF.A04(list2, i2);
                        }
                    }
                    float f3 = f2 - f;
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        MSX.A1Q(A1E2, AbstractC166987dD.A0A((AbstractC167007dF.A04(list2, i3) - f) / f3, 100.0f) / 100.0f);
                    }
                    AbstractC23641Du.A05(C12L.A00.A04, new JXO(obj2, A1E2, str2, null, 9), AbstractC141776au.A00(niw));
                    niw.A07.A00(new OA7(System.currentTimeMillis(), str, A1E2));
                    c3ny = AbstractC25227BEk.A0i();
                } else {
                    boolean z2 = c3ny2 instanceof C194848jk;
                    c3ny = c3ny2;
                    if (!z2) {
                        throw B4Z.A00();
                    }
                }
                if (!(c3ny instanceof C3NX)) {
                    if (c3ny instanceof C194848jk) {
                        AbstractC12120kG.A07("StackedTimelineAudioTrackViewModel", "fetchAmplitudesForAudioOverlay failed", null);
                    } else {
                        throw B4Z.A00();
                    }
                }
            } catch (SQLiteBlobTooBigException unused2) {
                AbstractC23641Du.A05(C12L.A00.A04, new MCF(this.A08, this.A0B, null, 17), AbstractC141776au.A00((AbstractC52922bZ) this.A09));
            }
        } else {
            C1JX c1jx2 = C1JX.A02;
            int i4 = this.A00;
            if (i4 != 0) {
                if (i4 != 1) {
                    AbstractC09560e7.A00(obj3);
                } else {
                    A04 = this.A05;
                    lln = (LLN) this.A03;
                    interfaceC19960yQ = (InterfaceC19960yQ) this.A02;
                    AbstractC09560e7.A00(obj3);
                }
            } else {
                AbstractC09560e7.A00(obj3);
                interfaceC19960yQ = (InterfaceC19960yQ) this.A02;
                C50650MXp c50650MXp = (C50650MXp) this.A04;
                UserSession userSession2 = c50650MXp.A01;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A07;
                String str5 = this.A0B;
                lln = new LLN(new LoggingData(str5, this.A0A), interfaceC11380iw, AbstractC12220kQ.A01(interfaceC11380iw, userSession2));
                A04 = c50650MXp.A02.A04(UserMonetizationProductType.A0A);
                AppreciationMediaSettingsApi appreciationMediaSettingsApi = c50650MXp.A00;
                C38321qM c38321qM = (C38321qM) this.A01;
                Boolean bool = (Boolean) this.A09;
                Boolean bool2 = (Boolean) this.A08;
                this.A02 = interfaceC19960yQ;
                this.A03 = lln;
                this.A05 = A04;
                this.A00 = 1;
                obj3 = appreciationMediaSettingsApi.A00(c38321qM, bool, bool2, str5, this);
                if (obj3 == c1jx2) {
                    return c1jx2;
                }
            }
            C3NY c3ny3 = (C3NY) obj3;
            Boolean bool3 = (Boolean) this.A09;
            if (bool3 != null) {
                C38321qM c38321qM2 = (C38321qM) this.A01;
                boolean booleanValue = bool3.booleanValue();
                String A2u = c38321qM2.A2u();
                if (A2u != null) {
                    if (booleanValue) {
                        num6 = C05F.A15;
                    } else {
                        num6 = C05F.A1F;
                    }
                    LLN.A05(lln, num6, A2u, A04);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            Boolean bool4 = (Boolean) this.A08;
            if (bool4 != null) {
                C38321qM c38321qM3 = (C38321qM) this.A01;
                boolean booleanValue2 = bool4.booleanValue();
                String A2u2 = c38321qM3.A2u();
                if (A2u2 != null) {
                    if (booleanValue2) {
                        num5 = C05F.A0A;
                    } else {
                        num5 = C05F.A0B;
                    }
                    LLN.A05(lln, num5, A2u2, A04);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            if (c3ny3 instanceof C3NX) {
                if (bool3 != null) {
                    C38321qM c38321qM4 = (C38321qM) this.A01;
                    boolean booleanValue3 = bool3.booleanValue();
                    String A2u3 = c38321qM4.A2u();
                    if (A2u3 != null) {
                        if (booleanValue3) {
                            num4 = C05F.A15;
                        } else {
                            num4 = C05F.A1F;
                        }
                        LLN.A06(lln, num4, A2u3, A04);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                if (bool4 != null) {
                    C38321qM c38321qM5 = (C38321qM) this.A01;
                    boolean booleanValue4 = bool4.booleanValue();
                    String A2u4 = c38321qM5.A2u();
                    if (A2u4 != null) {
                        if (booleanValue4) {
                            num3 = C05F.A0A;
                        } else {
                            num3 = C05F.A0B;
                        }
                        LLN.A06(lln, num3, A2u4, A04);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                A0h = AbstractC25225BEi.A0z(((C3NX) c3ny3).A00);
                this.A02 = null;
                this.A03 = null;
                this.A00 = 2;
            } else if (c3ny3 instanceof C194848jk) {
                if (bool3 != null) {
                    C38321qM c38321qM6 = (C38321qM) this.A01;
                    boolean booleanValue5 = bool3.booleanValue();
                    String A2u5 = c38321qM6.A2u();
                    if (A2u5 != null) {
                        if (booleanValue5) {
                            num2 = C05F.A15;
                        } else {
                            num2 = C05F.A1F;
                        }
                        LLN.A04(lln, num2, A2u5, A04);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                if (bool4 != null) {
                    C38321qM c38321qM7 = (C38321qM) this.A01;
                    boolean booleanValue6 = bool4.booleanValue();
                    String A2u6 = c38321qM7.A2u();
                    if (A2u6 != null) {
                        if (booleanValue6) {
                            num = C05F.A0A;
                        } else {
                            num = C05F.A0B;
                        }
                        LLN.A04(lln, num, A2u6, A04);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                A0h = AbstractC25227BEk.A0h();
                this.A02 = null;
                this.A03 = null;
                this.A00 = 3;
            } else {
                throw B4Z.A00();
            }
            if (interfaceC19960yQ.emit(A0h, this) == c1jx2) {
                return c1jx2;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYp) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYp(NIW niw, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, boolean z) {
        super(2, interfaceC23621Ds);
        this.A09 = niw;
        this.A0A = str;
        this.A08 = interfaceC16620sF;
        this.A0B = str2;
        this.A05 = z;
        this.A07 = interfaceC16820sZ;
    }
}
