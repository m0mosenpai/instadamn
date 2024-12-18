package X;

import android.widget.Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.discovery.mediamap.fragment.LocationSearchFragment;
import java.util.List;

/* renamed from: X.Txf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65986Txf extends C1I4 {
    public final int A00;
    public final Object A01;

    public C65986Txf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C67681Uvy c67681Uvy;
        UZ1 uz1;
        String str;
        Integer num;
        String optionalStringField;
        String optionalStringField2;
        int A03;
        IllegalStateException illegalStateException;
        int i2;
        int i3;
        switch (this.A00) {
            case 2:
                int A0N = AbstractC167017dG.A0N(recyclerView, -916762870);
                super.onScrollStateChanged(recyclerView, i);
                if (!recyclerView.canScrollVertically(1)) {
                    UFZ A01 = ((UF1) this.A01).A01();
                    if ((A01 instanceof C67681Uvy) && (uz1 = (c67681Uvy = (C67681Uvy) A01).A00) != null && uz1.getCoercedBooleanField(0, "has_next_page") && ((UFZ) c67681Uvy).A06.A02() != EnumC68120VCd.LOADING) {
                        UZ1 uz12 = c67681Uvy.A00;
                        if (uz12 != null) {
                            str = uz12.getOptionalStringField(1, "end_cursor");
                        } else {
                            str = null;
                        }
                        UZ1 uz13 = c67681Uvy.A00;
                        if (uz13 != null && (optionalStringField2 = uz13.getOptionalStringField(1, "end_cursor")) != null) {
                            num = AbstractC58319PtB.A0m(optionalStringField2);
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            String valueOf = String.valueOf(num.intValue() + 25);
                            String str2 = str;
                            if (str == null) {
                                str2 = "0";
                            }
                            C67681Uvy.A04(c67681Uvy, null, "client_fetch_payouthub_init", null, null, null, "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", str2, valueOf, null, null, null, null);
                            ((UFZ) c67681Uvy).A00 = null;
                            String str3 = c67681Uvy.A03;
                            String str4 = str;
                            if (str == null) {
                                str4 = "0";
                            }
                            C67681Uvy.A06(c67681Uvy, null, null, "load_more", str3, str4, valueOf, 667758015, 0);
                            C67681Uvy.A07("fetch_init");
                            C58252li c58252li = c67681Uvy.A04;
                            Object value = c67681Uvy.A05.getValue();
                            C2JS c2js = (C2JS) ((AbstractC67710Uwb) c67681Uvy).A03.A02();
                            if (c2js != null && (optionalStringField = c2js.getOptionalStringField(0, "financial_id")) != null) {
                                String str5 = c67681Uvy.A03;
                                String str6 = c67681Uvy.A0B().A00;
                                C14360o3.A0B(str5, 2);
                                Q8J A00 = REU.A00(new C70274WPf(value, str6, str, str5, optionalStringField, 2), C2FP.A06());
                                C14360o3.A07(A00);
                                AbstractC63246Sg0.A02(A00, c58252li, new C70308WQo(c67681Uvy, str, valueOf));
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                C0f9.A0A(798458621, A0N);
                return;
            case 3:
                int A0N2 = AbstractC167017dG.A0N(recyclerView, -425656742);
                if (i == 0) {
                    C70908WkB c70908WkB = ((C69644Vsl) this.A01).A00;
                    if (c70908WkB != null) {
                        C70908WkB.A02(c70908WkB);
                    } else {
                        IllegalStateException A0g = AbstractC166997dE.A0g();
                        C0f9.A0A(726153751, A0N2);
                        throw A0g;
                    }
                }
                super.onScrollStateChanged(recyclerView, i);
                C0f9.A0A(-2036184304, A0N2);
                return;
            case 4:
                A03 = C0f9.A03(-1507862182);
                C14360o3.A0B(recyclerView, 0);
                AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                if (abstractC70663Fe != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
                    int A1a = linearLayoutManager.A1a();
                    Object obj = recyclerView.A0A;
                    if (obj != null) {
                        Adapter adapter = (Adapter) obj;
                        C67969V4i c67969V4i = (C67969V4i) this.A01;
                        int i4 = c67969V4i.A00;
                        if (A1a > i4) {
                            List list = c67969V4i.A02;
                            int size = list.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                ((AbstractC674232h) list.get(i5)).A02(adapter, linearLayoutManager.A1b());
                            }
                        } else if (A1a < i4) {
                            List list2 = c67969V4i.A02;
                            int size2 = list2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                ((AbstractC674232h) list2.get(i6)).A03(adapter, A1a);
                            }
                        }
                        c67969V4i.A00 = A1a;
                        C71133Gz c71133Gz = c67969V4i.A01;
                        if (c71133Gz != null) {
                            if (i == 0) {
                                c71133Gz.setEnabled(true);
                                c71133Gz.A00();
                            } else {
                                c71133Gz.setEnabled(false);
                            }
                            i3 = 455490255;
                            break;
                        } else {
                            illegalStateException = new IllegalStateException("Required value was null.");
                            i2 = -403230544;
                        }
                    } else {
                        illegalStateException = new IllegalStateException("Required value was null.");
                        i2 = -1413707263;
                    }
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i2 = -682001580;
                }
                C0f9.A0A(i2, A03);
                throw illegalStateException;
            case 5:
                A03 = C0f9.A03(-1396178329);
                if (i == 0) {
                    ((ViewOnKeyListenerC67971V4l) this.A01).A03.sendEmptyMessageDelayed(0, 200L);
                }
                i3 = -1085739109;
                break;
            case 6:
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
            case 7:
                A03 = C0f9.A03(519290148);
                if (i == 1) {
                    LocationSearchFragment.A00((LocationSearchFragment) this.A01, false);
                }
                i3 = 805064401;
                break;
            case 8:
                A03 = C0f9.A03(-1947372702);
                super.onScrollStateChanged(recyclerView, i);
                i3 = 2055515395;
                break;
        }
        C0f9.A0A(i3, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ae, code lost:
    
        if (r11.getCurrentPositionMs() <= 500) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b2, code lost:
    
        if (r11.A0W == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c1, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11.A0m, 36317702289167844L) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c5, code lost:
    
        r0 = r11.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c7, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c9, code lost:
    
        r12 = r0.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d2, code lost:
    
        if (r11.getCurrentPositionMs() <= 500) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d4, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d5, code lost:
    
        r0 = r11.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d7, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d9, code lost:
    
        r1 = r0.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0241, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0247, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x024d, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x021c, code lost:
    
        r0 = r6;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x021f, code lost:
    
        if (r0 != r4) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0221, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02d0, code lost:
    
        if (r9 < r4.A0H) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02e2, code lost:
    
        if (r6 < r4.A0H) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0139, code lost:
    
        if (r6 <= r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013b, code lost:
    
        r1 = r5.A05.A02.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0147, code lost:
    
        if ((r1.get(r6) instanceof X.V2P) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0149, code lost:
    
        r1 = r1.get(r6);
        X.C14360o3.A0C(r1, "null cannot be cast to non-null type com.instagram.canvas.framework.model.data.VideoBlockData");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0156, code lost:
    
        if (r10.equals(r1) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015a, code lost:
    
        if (r6 != (-1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015c, code lost:
    
        r0 = r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015e, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0160, code lost:
    
        r0.Eol("scroll", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0167, code lost:
    
        r0 = (X.UJ1) r16.A0V(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016d, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0179, code lost:
    
        if (r0.A02.getGlobalVisibleRect(r5.A02) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0188, code lost:
    
        if (r1.height() <= (r8.getHeight() * 0.5f)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
    
        r10 = r5.A07;
        X.C14360o3.A0B(r10, 1);
        r11 = r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0195, code lost:
    
        if (r11 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0197, code lost:
    
        r11.E3d("scroll");
        r5 = r9.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019c, code lost:
    
        if (r5 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x019e, code lost:
    
        r4 = r5.A00.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
    
        if (r4 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a6, code lost:
    
        r11 = (X.C4QT) r11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0236  */
    @Override // X.C1I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65986Txf.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
