package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LLB {
    public long A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public ConstraintLayout A03;
    public IgEditText A04;
    public IgSimpleImageView A05;
    public IgTextView A06;
    public IgImageView A07;
    public IgImageView A08;
    public IgImageView A09;
    public MRR A0A;
    public C148396m9 A0B;
    public C7GN A0C;
    public IgBouncyUfiButtonImageView A0D;
    public Long A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public IgTextView A0M;
    public final Context A0N;
    public final BaseFragmentActivity A0O;
    public final AbstractC59962oe A0P;
    public final UserSession A0Q;
    public final IgLinearLayout A0R;
    public final MRK A0S;
    public final L8P A0T;
    public final Jn3 A0U;
    public final C7TG A0V;
    public final C2DS A0W;
    public final InterfaceC678133v A0X;
    public final C18A A0Y;
    public final String A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final Bundle A0e;

    public LLB(Context context, Bundle bundle, BaseFragmentActivity baseFragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, IgLinearLayout igLinearLayout, MRK mrk, Jn3 jn3, InterfaceC678133v interfaceC678133v, String str, long j, boolean z, boolean z2) {
        AbstractC25229BEm.A1K(userSession, 5, jn3);
        this.A0N = context;
        this.A0P = abstractC59962oe;
        this.A0e = bundle;
        this.A0O = baseFragmentActivity;
        this.A0Q = userSession;
        this.A00 = j;
        this.A0c = z;
        this.A0S = mrk;
        this.A0R = igLinearLayout;
        this.A0X = interfaceC678133v;
        this.A0U = jn3;
        this.A0Z = str;
        this.A0d = z2;
        this.A0V = AbstractC165967bO.A00(userSession);
        this.A0W = AbstractC28761aE.A00(userSession);
        this.A0Y = AnonymousClass189.A00(userSession);
        this.A0T = new L8P();
        this.A0b = AbstractC09440dt.A01(new MHM(this, 32));
        this.A0a = AbstractC09440dt.A01(new MHM(this, 31));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017b, code lost:
    
        if (r32.A05 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017d, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0187, code lost:
    
        if (X.C18U.A06(r2, r3, 36321202687517905L) != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x018a, code lost:
    
        r31.A0J = r1;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018f, code lost:
    
        if (r32.A0M != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0191, code lost:
    
        r0 = X.C4AC.A08(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0195, code lost:
    
        if (r0 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0197, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0198, code lost:
    
        r31.A0H = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x019c, code lost:
    
        if (r31.A01 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x019e, code lost:
    
        r16 = 0;
        r0 = X.C18U.A06(r2, r3, 36320476838044186L);
        r11 = 0;
        r12 = 8;
        r1 = r31.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ae, code lost:
    
        if (r0 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b0, code lost:
    
        if (r1 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b2, code lost:
    
        r1.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b5, code lost:
    
        r1 = r31.A02;
        r12 = "smashableSendButton";
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b9, code lost:
    
        if (r1 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01bb, code lost:
    
        X.LQ1.A00(r1, 14, r31, r32);
        r0 = r31.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c2, code lost:
    
        if (r0 != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c4, code lost:
    
        r12 = "replyMessage";
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
    
        r1 = r0.getLayoutParams();
        X.C14360o3.A0C(r1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        r1 = (X.C56302iJ) r1;
        r0 = r31.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d8, code lost:
    
        if (r0 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01da, code lost:
    
        r1.A0N = r0.getId();
        r0 = r31.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e2, code lost:
    
        if (r0 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e4, code lost:
    
        r1 = new X.C148396m9(r0);
        r31.A0B = r1;
        r1.A00(X.C1QI.A0B(r7, null).getDefaultColor(), false);
        r8 = r31.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f8, code lost:
    
        if (r8 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01fa, code lost:
    
        r8.A02.getDrawable().setTint(X.C1QI.A0C(r7, null).getDefaultColor());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0232, code lost:
    
        r1 = r31.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0234, code lost:
    
        if (r1 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0236, code lost:
    
        r12 = "replyMessageContainer";
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0239, code lost:
    
        r31.A07 = X.AbstractC31172DnG.A0Z(r1, com.facebook.R.id.note_quick_reply_composer_button_left);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0246, code lost:
    
        if (A04(r32) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0251, code lost:
    
        if (X.C18U.A06(r2, r3, 36324853409788443L) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02ca, code lost:
    
        r1 = r31.A03;
        r12 = "replyMessageContainer";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ce, code lost:
    
        if (r1 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d0, code lost:
    
        r1 = X.AbstractC31172DnG.A0a(r1, com.facebook.R.id.note_quick_reply_voice_button);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d9, code lost:
    
        if (r31.A0I != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02db, code lost:
    
        r16 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02dd, code lost:
    
        r1.setVisibility(r16);
        r31.A09 = r1;
        r1 = r31.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e6, code lost:
    
        if (r1 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e8, code lost:
    
        r1 = X.AbstractC31172DnG.A0a(r1, com.facebook.R.id.note_quick_reply_sticker_button);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f1, code lost:
    
        if (r31.A0L != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f5, code lost:
    
        if (r31.A0J != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f7, code lost:
    
        r11 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f9, code lost:
    
        r1.setVisibility(r11);
        X.ViewOnClickListenerC48062LPn.A00(r1, 31, r31);
        r31.A08 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0305, code lost:
    
        if (r31.A0C != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0307, code lost:
    
        r0 = r0.A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030f, code lost:
    
        if (r0 == null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0311, code lost:
    
        r11 = new com.instagram.model.direct.DirectShareTarget(r0);
        r8 = r31.A0R;
        r1 = r31.A01;
        r12 = "replyComposerContainer";
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x031c, code lost:
    
        if (r1 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x031e, code lost:
    
        r29 = X.AbstractC31177DnL.A0V(r1, com.facebook.R.id.note_composer_voice_recording_stub);
        r30 = X.AbstractC31177DnL.A0U(r8, com.facebook.R.id.note_composer_voice_lock_stub);
        r0 = r31.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x032e, code lost:
    
        if (r0 != null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0330, code lost:
    
        r12 = "voiceRecorderButton";
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0361, code lost:
    
        r24 = new X.C7GJ(r0, r8, r8, r1, r29, r30);
        r8 = new X.C49348Lrg(r31, r32);
        r1 = X.C1XM.A00(new X.MHM(r31, 33));
        r0 = X.C7GM.A00(r7, r3, null, r8, r24, r11.A01(), true, true);
        r0.A0G(r1);
        r31.A0C = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0397, code lost:
    
        r1 = r31.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0399, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x039b, code lost:
    
        r1.removeTextChangedListener((android.text.TextWatcher) r31.A0a.getValue());
        r1 = r31.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03a8, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03aa, code lost:
    
        r1.addTextChangedListener(new X.LO3(1, r31, r32));
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03b4, code lost:
    
        if (r31.A0H == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03b6, code lost:
    
        r12 = new X.C48766LhZ(r31, 1);
        r14 = r31.A0U;
        r0 = r32.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03bf, code lost:
    
        if (r0 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03c1, code lost:
    
        r7 = r0.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03c3, code lost:
    
        r15 = r31.A00;
        r13 = r32.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03c7, code lost:
    
        if (r7 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03c9, code lost:
    
        r0 = r14.A03.A04(r7, java.lang.String.valueOf(r15));
        r1 = r14.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03d5, code lost:
    
        if (r0 == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03d7, code lost:
    
        r0 = "❤️";
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03d9, code lost:
    
        r1.Egh(r0);
        X.AbstractC166987dD.A1Z(new X.MBs(r14, (X.InterfaceC23621Ds) null, 16, r15), X.AbstractC141776au.A00(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03fb, code lost:
    
        if (X.C18U.A06(r2, r3, 36324264999268404L) == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03fd, code lost:
    
        r2 = X.LL7.A01;
        r1 = r32.A0B;
        r0 = r31.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0403, code lost:
    
        if (r0 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x040d, code lost:
    
        if (r2.A04(X.AbstractC166997dE.A0L(r0), r1) == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x040f, code lost:
    
        r1 = r31.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0411, code lost:
    
        if (r1 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0413, code lost:
    
        r0 = (com.instagram.common.ui.base.IgSimpleImageView) r1.findViewById(com.facebook.R.id.note_birthday_animation_image_view);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x041c, code lost:
    
        r31.A05 = r0;
        r1 = r31.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0420, code lost:
    
        if (r1 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0422, code lost:
    
        r3 = (com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView) r1.findViewById(com.facebook.R.id.note_like_button);
        r1 = r31.A0T;
        X.C14360o3.A0A(r3);
        r1.A01(r31.A05, r3);
        X.AbstractC166987dD.A1Z(new X.MC6(r31, r12, (X.InterfaceC23621Ds) null, 23), X.C07Y.A00(r31.A0P));
        r31.A0D = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x045c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x045e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0461, code lost:
    
        r11 = r14.A04;
        r17 = ((java.lang.Iterable) r11.A0p.getValue()).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x046f, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0474, code lost:
    
        if (r17.hasNext() == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0476, code lost:
    
        r7 = r17.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0487, code lost:
    
        if (X.C14360o3.A0K(((X.C6C9) r7).A0H, java.lang.String.valueOf(r15)) == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0489, code lost:
    
        r7 = (X.C6C9) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x048b, code lost:
    
        if (r7 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x048d, code lost:
    
        r0 = r7.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x048f, code lost:
    
        if (r0 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0491, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0493, code lost:
    
        if (r0 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0495, code lost:
    
        r0 = (com.instagram.api.schemas.NoteEmojiReactionInfo) X.AbstractC001800i.A0J(r0);
        r1 = r14.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x049d, code lost:
    
        if (r0 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x049f, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04a1, code lost:
    
        r1.Egh(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04a6, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04a8, code lost:
    
        r0 = (X.C45052Jwh) X.AbstractC25231BEo.A0o(r13, r11.A0r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04b0, code lost:
    
        if (r0 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04b2, code lost:
    
        r0 = r0.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04b4, code lost:
    
        if (r0 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04b6, code lost:
    
        r11 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04be, code lost:
    
        if (r11.hasNext() == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04c0, code lost:
    
        r7 = r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04d1, code lost:
    
        if (X.C14360o3.A0K(((X.C6C9) r7).A0H, java.lang.String.valueOf(r15)) == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04d3, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04d4, code lost:
    
        r8 = (X.C6C9) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04d6, code lost:
    
        if (r8 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x04d8, code lost:
    
        r0 = r8.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04da, code lost:
    
        if (r0 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04dc, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04df, code lost:
    
        r0 = X.C16930sl.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04e2, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04e4, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0447, code lost:
    
        r0 = r31.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0449, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x044b, code lost:
    
        r0 = r0.getText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x044f, code lost:
    
        if (r0 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0455, code lost:
    
        if (r0.length() == 0) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0457, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0458, code lost:
    
        A03(r31, r6, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x045b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0253, code lost:
    
        if (r15 != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0255, code lost:
    
        if (r14 != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0259, code lost:
    
        if (r32.A05 != null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x025d, code lost:
    
        if (r31.A0c != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0268, code lost:
    
        if (X.C18U.A06(r2, r3, 36320704471376700L) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x026a, code lost:
    
        r13 = r31.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x026c, code lost:
    
        if (r13 != null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x026e, code lost:
    
        r12 = "composerButtonLeft";
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0272, code lost:
    
        r13.setVisibility(0);
        r15 = r13.getContext();
        r8 = X.AbstractC167017dG.A04(r15);
        r13.setPadding(r8, r8, r8, r8);
        r1 = r15.getDrawable(com.facebook.R.drawable.direct_message_composer_thread_camera_icon);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0287, code lost:
    
        if (r1 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0289, code lost:
    
        X.AbstractC166997dE.A1F(r1, X.C1QI.A0C(r15, null).getDefaultColor());
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0294, code lost:
    
        r13.setImageDrawable(r1);
        r14 = new android.graphics.drawable.ShapeDrawable(new X.C7AQ(r8));
        X.AbstractC148406mA.A02(android.graphics.Paint.Style.FILL, r14, r14.getShape(), 0.0f, X.C1QI.A0B(r15, null).getDefaultColor());
        r13.setBackground(r14);
        X.AbstractC31172DnG.A1E(r15.getResources(), r13, 2131963915);
        X.KKo.A00(X.AbstractC166987dD.A0s(r13), r32, r31, 9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0334, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01c6, code lost:
    
        X.C14360o3.A0F(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x020c, code lost:
    
        if (r1 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0210, code lost:
    
        if (r31.A0I != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0214, code lost:
    
        if (r31.A0L != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0218, code lost:
    
        if (r31.A0J != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x021a, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x021b, code lost:
    
        r1.setVisibility(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x021e, code lost:
    
        r1 = r31.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0220, code lost:
    
        if (r1 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0222, code lost:
    
        X.AbstractC166987dD.A1O(r7, r1, X.C1QI.A01(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0229, code lost:
    
        r1 = r31.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x022b, code lost:
    
        if (r1 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x022d, code lost:
    
        X.LQ1.A00(r1, 14, r31, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0337, code lost:
    
        r0 = X.C4AC.A05(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0189, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x016c, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x014f, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0128, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0132, code lost:
    
        if (X.C18U.A06(r2, r3, 36324853409722906L) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0116, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0117, code lost:
    
        if (r11 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x033f, code lost:
    
        if (r32.A05 == null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0341, code lost:
    
        r0 = X.AbstractC166997dE.A0r(r7.getResources(), r32.A09, 2131956723);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0350, code lost:
    
        r1 = r7.getResources();
        r0 = 2131968783;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0357, code lost:
    
        if (r15 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0359, code lost:
    
        r0 = 2131961071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x00a6, code lost:
    
        r0 = com.facebook.R.drawable.note_quick_reply_composer_background_shhmode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x008f, code lost:
    
        if (r2 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (X.C28531Zo.A04.A0H(r31.A0Q, r2) != true) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (X.C28531Zo.A04.A0I(r31.A0Q, r2) == true) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        r7 = r31.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r15 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        r0 = com.facebook.R.drawable.group_mention_quick_reply_composer_background;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (r14 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r11 = r7.getDrawable(r0);
        r3 = r31.A0Q;
        r2 = X.C06090Tz.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        if (X.C18U.A06(r2, r3, 36320704471573310L) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
    
        if (r11 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
    
        X.AbstractC25231BEo.A0x(r7, r11, X.AbstractC53242c7.A0H(r7, com.facebook.R.attr.igds_color_elevated_highlight_background));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        r0 = r31.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
    
        if (r0 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        r0.setBackground(r11);
        r12 = r31.A04;
        r19 = "replyMessage";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
    
        if (r12 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        if (r32.A0O == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
    
        if (X.C4AC.A02(r3) == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        r1 = r7.getResources();
        r0 = 2131968787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e6, code lost:
    
        r0 = r1.getString(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ea, code lost:
    
        r12.setHint(X.AbstractC25225BEi.A0H(r0));
        r1 = r31.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
    
        if (r1 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fb, code lost:
    
        if (r1.getBoolean("pending_admin_approval") != true) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fd, code lost:
    
        r0 = r31.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0101, code lost:
    
        r0.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0104, code lost:
    
        r11 = A04(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        if (r11 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010a, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0114, code lost:
    
        if (X.C18U.A06(r2, r3, 36324853409657369L) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0119, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:
    
        if (X.C18U.A06(r2, r3, 36324853409853980L) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0125, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0126, code lost:
    
        if (r11 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0134, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0135, code lost:
    
        if (r13 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0137, code lost:
    
        if (r15 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0139, code lost:
    
        if (r14 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013d, code lost:
    
        if (r32.A05 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0141, code lost:
    
        if (r31.A0c != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0143, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014d, code lost:
    
        if (X.C18U.A06(r2, r3, 36320704471311163L) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0150, code lost:
    
        r31.A0I = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        if (r12 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0154, code lost:
    
        if (r15 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0156, code lost:
    
        if (r14 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015a, code lost:
    
        if (r32.A05 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015e, code lost:
    
        if (r31.A0c != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016a, code lost:
    
        if (X.C18U.A06(r2, r3, 36321202687452368L) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016d, code lost:
    
        r31.A0L = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016f, code lost:
    
        if (r11 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0171, code lost:
    
        if (r15 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0173, code lost:
    
        if (r14 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0177, code lost:
    
        if (r31.A0c != false) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C45842KQx r32) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLB.A06(X.KQx):void");
    }

    private final void A00() {
        IgEditText igEditText = this.A04;
        if (igEditText != null) {
            ViewGroup.LayoutParams layoutParams = igEditText.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C56302iJ c56302iJ = (C56302iJ) layoutParams;
            FrameLayout frameLayout = this.A02;
            if (frameLayout != null) {
                c56302iJ.A0N = frameLayout.getId();
                FrameLayout frameLayout2 = this.A02;
                if (frameLayout2 != null) {
                    this.A0B = new C148396m9(frameLayout2);
                    Context context = this.A0N;
                    ColorStateList A0B = C1QI.A0B(context, null);
                    C148396m9 c148396m9 = this.A0B;
                    if (c148396m9 != null) {
                        c148396m9.A00(A0B.getDefaultColor(), true);
                    }
                    C148396m9 c148396m92 = this.A0B;
                    if (c148396m92 != null) {
                        c148396m92.A02.getDrawable().setTint(C1QI.A0C(context, null).getDefaultColor());
                    }
                    FrameLayout frameLayout3 = this.A02;
                    if (frameLayout3 != null) {
                        ViewOnClickListenerC48062LPn.A00(frameLayout3, 30, this);
                        IgTextView igTextView = this.A06;
                        if (igTextView != null) {
                            igTextView.setTextColor(A0B.getColorForState(new int[]{-16842910}, A0B.getDefaultColor()));
                        }
                        IgTextView igTextView2 = this.A06;
                        if (igTextView2 != null) {
                            ViewOnClickListenerC48062LPn.A00(igTextView2, 30, this);
                        }
                        IgEditText igEditText2 = this.A04;
                        if (igEditText2 != null) {
                            igEditText2.addTextChangedListener((TextWatcher) this.A0a.getValue());
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F("smashableSendButton");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("replyMessage");
        throw C00O.createAndThrow();
    }

    public static final void A02(LLB llb, C45842KQx c45842KQx) {
        Context context = llb.A0N;
        String string = context.getString(2131968716);
        llb.A0G = string;
        if (c45842KQx.A05 != null) {
            String string2 = context.getString(2131968715);
            if (string2 != null) {
                C146106i8 A0Y = AbstractC31174DnI.A0Y();
                A0Y.A0D = llb.A0G;
                A0Y.A0L = true;
                A0Y.A0G = string2;
                A0Y.A0A(new C49490Lu3(llb, 9));
                A0Y.A02 = context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
                A0Y.A0R = true;
                AbstractC25233BEq.A1F(A0Y);
                return;
            }
            return;
        }
        C9GR.A09(context, string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0051, code lost:
    
        if (r8 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.LLB r7, boolean r8, boolean r9) {
        /*
            com.instagram.common.session.UserSession r6 = r7.A0Q
            r5 = 0
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320476838044186(0x8109480001221a, double:3.032554030975907E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            r3 = 0
            r4 = 8
            if (r0 == 0) goto L93
            if (r8 == 0) goto L89
            X.6m9 r1 = r7.A0B
            if (r1 == 0) goto L1d
            r0 = 0
            r1.A01(r0, r5, r9)
        L1d:
            X.Jn3 r0 = r7.A0U
            X.0UO r0 = r0.A0A
            java.lang.Object r1 = r0.getValue()
            X.KR0 r0 = X.KR0.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            java.lang.String r2 = "voiceRecorderButton"
            if (r0 == 0) goto L51
            if (r8 == 0) goto L81
            boolean r0 = r7.A0d
            if (r0 == 0) goto L53
            boolean r0 = X.C4AC.A0A(r6)
            if (r0 == 0) goto L53
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A09
            if (r0 == 0) goto La9
            r0.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A08
            if (r0 == 0) goto L49
            r0.setVisibility(r4)
        L49:
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r7.A0D
            if (r0 == 0) goto L50
            r0.setVisibility(r4)
        L50:
            return
        L51:
            if (r8 == 0) goto L81
        L53:
            boolean r0 = r7.A0H
            if (r0 == 0) goto L5e
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r7.A0D
            if (r0 == 0) goto L5e
            r0.setVisibility(r5)
        L5e:
            boolean r0 = r7.A0I
            if (r0 == 0) goto L6d
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r7.A09
            if (r1 == 0) goto La9
            int r0 = X.AbstractC167007dF.A05(r8)
            r1.setVisibility(r0)
        L6d:
            boolean r0 = r7.A0L
            if (r0 != 0) goto L75
            boolean r0 = r7.A0J
            if (r0 == 0) goto L50
        L75:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A08
            if (r0 == 0) goto L50
            if (r8 != 0) goto L7d
            r3 = 8
        L7d:
            r0.setVisibility(r3)
            return
        L81:
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r7.A0D
            if (r0 == 0) goto L5e
            r0.setVisibility(r4)
            goto L5e
        L89:
            X.6m9 r2 = r7.A0B
            if (r2 == 0) goto L1d
            r1 = 0
            r0 = 1
            r2.A01(r1, r0, r9)
            goto L1d
        L93:
            com.instagram.common.ui.base.IgTextView r1 = r7.A06
            if (r1 == 0) goto L9e
            int r0 = X.AbstractC31175DnJ.A01(r8)
            r1.setVisibility(r0)
        L9e:
            com.instagram.common.ui.base.IgTextView r1 = r7.A06
            if (r1 == 0) goto L1d
            r0 = r8 ^ 1
            r1.setEnabled(r0)
            goto L1d
        La9:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLB.A03(X.LLB, boolean, boolean):void");
    }

    private final boolean A04(C45842KQx c45842KQx) {
        DirectShareTarget directShareTarget;
        User A02 = this.A0Y.A02(c45842KQx.A08);
        if (A02 != null) {
            directShareTarget = new DirectShareTarget(A02);
        } else {
            directShareTarget = null;
        }
        if (directShareTarget == null) {
            return false;
        }
        if (!this.A0W.BZQ(directShareTarget).CWk(this.A0Q) && !(directShareTarget.A01() instanceof InterfaceC2056098k)) {
            return false;
        }
        return true;
    }

    public final void A05() {
        IgLinearLayout igLinearLayout = this.A0R;
        this.A01 = (FrameLayout) igLinearLayout.findViewById(R.id.note_quick_reply_composer_container);
        this.A03 = (ConstraintLayout) igLinearLayout.findViewById(R.id.note_quick_reply_message_container);
        this.A04 = (IgEditText) igLinearLayout.findViewById(R.id.note_quick_reply_message);
        this.A0M = AbstractC31172DnG.A0Y(igLinearLayout, R.id.note_quick_reply_blocked_message);
        Bundle bundle = this.A0e;
        if (bundle != null && bundle.getBoolean("pending_admin_approval")) {
            ConstraintLayout constraintLayout = this.A03;
            if (constraintLayout == null) {
                C14360o3.A0F("replyMessageContainer");
                throw C00O.createAndThrow();
            }
            constraintLayout.setVisibility(8);
        }
        this.A02 = (FrameLayout) igLinearLayout.findViewById(R.id.row_thread_composer_send_button_container);
        this.A06 = AbstractC31172DnG.A0Y(igLinearLayout, R.id.note_quick_reply_send_button);
        if (AbstractC167007dF.A1Z(this.A0b)) {
            A00();
        }
    }

    public final void A07(boolean z) {
        String str = "replyMessage";
        if (z) {
            IgEditText igEditText = this.A04;
            if (igEditText != null) {
                igEditText.setText((CharSequence) null);
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        IgEditText igEditText2 = this.A04;
        if (igEditText2 != null) {
            AbstractC13880nE.A0O(igEditText2);
            IgImageView igImageView = this.A07;
            if (igImageView == null) {
                str = "composerButtonLeft";
            } else {
                igImageView.setVisibility(8);
                IgImageView igImageView2 = this.A09;
                if (igImageView2 == null) {
                    str = "voiceRecorderButton";
                } else {
                    igImageView2.setVisibility(8);
                    IgImageView igImageView3 = this.A08;
                    if (igImageView3 != null) {
                        igImageView3.setVisibility(8);
                    }
                    IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = this.A0D;
                    if (igBouncyUfiButtonImageView != null) {
                        igBouncyUfiButtonImageView.setVisibility(8);
                    }
                    A00();
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(View view, LLB llb, C45842KQx c45842KQx) {
        A02(llb, c45842KQx);
        if (AbstractC167007dF.A1Z(llb.A0b)) {
            MRK mrk = llb.A0S;
            if (mrk != null) {
                mrk.DW1();
            }
            AbstractC13880nE.A0O(view);
            llb.A07(true);
            return;
        }
        BaseFragmentActivity baseFragmentActivity = llb.A0O;
        if (baseFragmentActivity == null) {
            return;
        }
        baseFragmentActivity.onBackPressed();
    }
}
