package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8js, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194918js extends C3PD implements TextWatcher, InterfaceC191008cw {
    public int A00;
    public int A01;
    public C218269ky A02;
    public C80T A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final Context A07;
    public final View A08;
    public final RecyclerView A09;
    public final UserSession A0A;
    public final TargetViewSizeProvider A0B;
    public final C8C0 A0C;
    public final InterfaceC190408by A0D;
    public final ArrayList A0E;
    public final boolean A0F;
    public final EditText A0G;
    public final TextView A0H;

    public C194918js(Context context, View view, EditText editText, RecyclerView recyclerView, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C8C0 c8c0, InterfaceC190408by interfaceC190408by, C190888ck c190888ck, boolean z, boolean z2) {
        List A08;
        int i;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(editText, 2);
        C14360o3.A0B(view, 3);
        C14360o3.A0B(targetViewSizeProvider, 5);
        C14360o3.A0B(userSession, 8);
        this.A09 = recyclerView;
        this.A0B = targetViewSizeProvider;
        if (z2) {
            A08 = AbstractC16960so.A1Q(AbstractC190898cl.A01("modern", null, false), AbstractC190898cl.A01(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, null, false), AbstractC190898cl.A01("strong_v2", null, false), AbstractC190898cl.A01("typewriter_v2", null, false), AbstractC190898cl.A01("meme", null, false), AbstractC190898cl.A01("directional", null, false));
        } else {
            A08 = AbstractC190898cl.A08();
        }
        this.A0E = new ArrayList(A08);
        this.A0A = userSession;
        this.A0D = interfaceC190408by;
        this.A07 = context;
        if (c190888ck != null) {
            i = Math.max(A01(this, c190888ck), 0);
        } else {
            i = 0;
        }
        A05(this, i, false);
        A05(this, A00(), true);
        this.A0G = editText;
        editText.addTextChangedListener(this);
        this.A08 = view;
        this.A0H = (TextView) view.findViewById(R.id.direct_camera_text_format_label);
        this.A0F = z;
        this.A0C = c8c0;
        C3P9 c3p9 = new C3P9(view);
        c3p9.A04 = this;
        c3p9.A07 = true;
        c3p9.A0D = true;
        c3p9.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09() {
        /*
            r9 = this;
            r0 = 1
            r9.A06 = r0
            X.8ck r0 = r9.A07()
            X.8cs r2 = r0.A04
            r4 = 0
            if (r2 == 0) goto L85
            android.widget.EditText r1 = r9.A0G
            android.text.Editable r0 = r1.getText()
            X.C14360o3.A07(r0)
            boolean r0 = X.AbstractC190978ct.A06(r0)
            if (r0 != 0) goto L85
            android.text.Editable r0 = r1.getText()
            X.C14360o3.A07(r0)
            boolean r0 = X.AbstractC190978ct.A05(r0)
            if (r0 == 0) goto L85
            boolean r0 = r2 instanceof X.C194978jy
            if (r0 == 0) goto L85
            r0 = 1
        L2d:
            com.instagram.common.session.UserSession r8 = r9.A0A
            X.8ck r7 = r9.A07()
            android.widget.EditText r6 = r9.A0G
            X.C14360o3.A0B(r8, r4)
            r1 = 1
            X.C14360o3.A0B(r7, r1)
            r1 = 2
            X.C14360o3.A0B(r6, r1)
            android.content.Context r5 = r6.getContext()
            X.C14360o3.A07(r5)
            android.text.Editable r3 = r6.getText()
            X.C14360o3.A07(r3)
            android.text.TextPaint r2 = r6.getPaint()
            X.C14360o3.A07(r2)
            r1 = 0
            X.AbstractC202898y7.A01(r3, r7, r0)
            X.AbstractC202838y1.A02(r5, r3, r7)
            X.AbstractC202928yA.A01(r5, r2, r3, r7)
            X.AbstractC202948yC.A00(r6, r7, r1)
            X.AbstractC202958yD.A00(r3, r7)
            android.widget.TextView r3 = r9.A0H
            if (r3 == 0) goto L7f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323075294833592(0x810ba500192bb8, double:3.034197305512673E-306)
            boolean r1 = X.C18U.A06(r2, r8, r0)
            X.8ck r0 = r9.A07()
            if (r1 == 0) goto L82
            int r0 = r0.A02
        L7c:
            r3.setText(r0)
        L7f:
            r9.A06 = r4
            return
        L82:
            int r0 = r0.A01
            goto L7c
        L85:
            r0 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194918js.A09():void");
    }

    public final void A0A(boolean z) {
        if (A06(true)) {
            C80T c80t = this.A03;
            if (c80t == null) {
                RecyclerView recyclerView = this.A09;
                if (recyclerView != null) {
                    c80t = new C80T(this.A07, recyclerView, this.A0B, this, false);
                    this.A03 = c80t;
                } else {
                    return;
                }
            }
            AbstractC125325le.A05(new View[]{c80t.A07}, z);
            return;
        }
        C218269ky c218269ky = this.A02;
        if (c218269ky == null) {
            Context context = this.A07;
            C8C0 c8c0 = this.A0C;
            if (c8c0 != null) {
                c218269ky = new C218269ky(context, this.A0A, c8c0, this);
                this.A02 = c218269ky;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        c218269ky.CMH(z);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final int A00() {
        if (this.A0D.CRN()) {
            return this.A05;
        }
        return this.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0109, code lost:
    
        if (r16 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0029, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r3, 36323075293850537L) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0042, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r3, 36323075294505907L) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f A[LOOP:0: B:14:0x0089->B:16:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A01(X.C194918js r18, X.C190888ck r19) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194918js.A01(X.8js, X.8ck):int");
    }

    private final ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        Iterator it = A03(this).iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            arrayList.add(new C23570AcO((C190888ck) next));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r3, 36323075293326241L) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bf, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r4, 36323075294047148L) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d6, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ea, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r4, 36323075293981611L) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0101, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0115, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r4, 36323075294112685L) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012c, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r4, 36323075294178222L) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r4, 36323075294243759L) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r4, 36323075294309296L) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36320670111769387L) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a7, code lost:
    
        if (X.C18U.A06(r2, r3, 36323075293916074L) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x005a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r3, 36323075294505907L) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0030, code lost:
    
        if (X.AbstractC185298Jv.A08(r20.A0A) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r3, 36323075293850537L) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A03(X.C194918js r20) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194918js.A03(X.8js):java.util.ArrayList");
    }

    public static final void A04(C194918js c194918js, int i, boolean z) {
        int i2;
        if (!z && c194918js.A0D.C6N() > 60) {
            return;
        }
        if (i == c194918js.A00()) {
            if (c194918js.A0D.CRN()) {
                i2 = c194918js.A01;
            } else {
                i2 = c194918js.A00;
            }
            if (i2 == i || !z) {
                return;
            }
            A05(c194918js, i, true);
            C22C A01 = AnonymousClass229.A01(c194918js.A0A);
            String str = c194918js.A07().A09;
            C448724r c448724r = A01.A0F;
            C14360o3.A0B(str, 0);
            C18920wW c18920wW = c448724r.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
            if (!A00.isSampled()) {
                return;
            }
            A00.A8R(C81X.A2s, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_TEXT_FORMAT_SELECTED");
            C22M c22m = c448724r.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            int i3 = 2;
            if (c22m.A01 != 2) {
                i3 = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i3));
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("format", str);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(c22m.A0C, "surface");
            A00.A8R(c448724r.A0J(), "camera_destination");
            A00.A8R(c22m.A0A, "composition_media_type");
            A00.AAP("composition_str_id", c22m.A0M);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
            return;
        }
        A05(c194918js, i, false);
        c194918js.A09();
        c194918js.A0D.Dsd(c194918js.A07(), C05F.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (X.C18U.A06(r2, r3, 36323075293719463L) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (X.C18U.A06(r2, r3, 36323075294768055L) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A06(boolean r9) {
        /*
            r8 = this;
            X.8by r5 = r8.A0D
            boolean r0 = r5.CRN()
            r7 = 1
            if (r0 == 0) goto L14
            com.instagram.common.session.UserSession r3 = r8.A0A
            if (r9 == 0) goto L66
            boolean r0 = X.AbstractC185298Jv.A09(r3)
        L11:
            r6 = 1
            if (r0 != 0) goto L15
        L14:
            r6 = 0
        L15:
            boolean r0 = r5.Cdo()
            if (r0 == 0) goto L31
            com.instagram.common.session.UserSession r3 = r8.A0A
            r0 = 0
            if (r9 == 0) goto L60
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A06
        L25:
            r0 = 36323075293719463(0x810ba500082ba7, double:3.034197304808093E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L32
        L31:
            r4 = 0
        L32:
            boolean r0 = r5.CUe()
            if (r0 == 0) goto L4e
            com.instagram.common.session.UserSession r3 = r8.A0A
            r0 = 0
            if (r9 == 0) goto L5a
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A06
        L42:
            r0 = 36323075294768055(0x810ba500182bb7, double:3.034197305471227E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L4f
        L4e:
            r1 = 0
        L4f:
            androidx.recyclerview.widget.RecyclerView r0 = r8.A09
            if (r0 == 0) goto L76
            if (r6 != 0) goto L59
            if (r4 != 0) goto L59
            if (r1 == 0) goto L76
        L59:
            return r7
        L5a:
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A05
            goto L42
        L60:
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A05
            goto L25
        L66:
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323075293260704(0x810ba500012ba0, double:3.034197304517972E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            goto L11
        L76:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194918js.A06(boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r9 == 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08() {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194918js.A08():void");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!this.A06) {
            A09();
        }
    }

    public static final void A05(C194918js c194918js, int i, boolean z) {
        ArrayList A03 = A03(c194918js);
        if (i < 0) {
            i = 0;
        }
        if (i >= A03.size()) {
            i = A03.size() - 1;
        }
        boolean CRN = c194918js.A0D.CRN();
        if (z) {
            if (CRN) {
                c194918js.A01 = i;
                return;
            } else {
                c194918js.A00 = i;
                return;
            }
        }
        if (CRN) {
            c194918js.A05 = i;
        } else {
            c194918js.A04 = i;
        }
    }

    public final C190888ck A07() {
        Object obj;
        int A00 = A00();
        ArrayList A03 = A03(this);
        if (A00 >= 0) {
            try {
                if (A00 < A03.size()) {
                    obj = A03.get(A00);
                    return (C190888ck) obj;
                }
            } catch (Exception e) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("getCurrentFormat() exception=%s.  isClips=%s.  curIdx=%d.   formatsSize=%d.", e.getLocalizedMessage(), Boolean.valueOf(this.A0D.CRN()), Integer.valueOf(A00), Integer.valueOf(A03.size()));
                C14360o3.A07(formatStrLocaleSafe);
                AbstractC12120kG.A07("TextFormatController", formatStrLocaleSafe, null);
                throw e;
            }
        }
        this.A05 = 0;
        this.A04 = 0;
        obj = (C190888ck) A03.get(0);
        return (C190888ck) obj;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        A05(this, (A00() + 1) % A03(this).size(), false);
        A09();
        this.A0D.Dsd(A07(), C05F.A01);
        return true;
    }

    @Override // X.InterfaceC191008cw
    public final void DNo(int i, boolean z) {
        A04(this, i, z);
    }
}
