package com.instagram.direct.realtime.armadilloexpress.plugins.backupupdategenerator;

import X.AbstractC167017dG;
import X.C46906Kon;
import com.facebook.msys.mci.AccountSession;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class IGBackupUpdateGeneratorPluginImplPostmailbox extends Postmailbox {
    public static final C46906Kon Companion = new Object();
    public static final String KEY_MIME_TYPE = "mimeType";
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String KEY_PREVIEW_OBJECT_ID = "previewObjectId";
    public static final String TAG = "IGBackupUpdateGeneratorPluginImplPostmailbox";
    public final UserSession userSession;

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d0, code lost:
    
        r20 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d2, code lost:
    
        r0 = new com.facebook.wamsys.wce.MessageBackupDirective(r31, r16, null, r18, r8, r20, r7, java.lang.Boolean.valueOf(r1), java.lang.Boolean.valueOf(r15), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e9, code lost:
    
        r4 = X.AbstractC166987dD.A1E();
        r3 = r2.metadata_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ef, code lost:
    
        if (r3 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f1, code lost:
    
        r3 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f3, code lost:
    
        X.C14360o3.A07(r3);
        r3 = X.LL6.A01(r3);
        r13 = X.LL6.A03(r9, r2, r3, r34);
        r9 = r2.content_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0200, code lost:
    
        if (r9 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0202, code lost:
    
        r9 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0206, code lost:
    
        if (r9.addMessageContentCase_ != 3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r4 = r27.userSession;
        X.C14360o3.A0B(r4, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0208, code lost:
    
        r7 = (com.instagram.direct.armadilloexpress.transportpayload.Link) r9.addMessageContent_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020c, code lost:
    
        r9 = r7.linkContext_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020e, code lost:
    
        if (r9 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0210, code lost:
    
        r9 = com.instagram.direct.armadilloexpress.transportpayload.LinkContext.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0216, code lost:
    
        if ((r9.bitField0_ & 32) == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0218, code lost:
    
        r7 = r9.linkPreviewThumbnail_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021a, code lost:
    
        if (r7 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021c, code lost:
    
        r7 = com.instagram.direct.armadilloexpress.transportpayload.Thumbnail.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021e, code lost:
    
        if (r7 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r14 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0220, code lost:
    
        r7 = r7.mediaTransport_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0222, code lost:
    
        if (r7 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0224, code lost:
    
        r7 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0226, code lost:
    
        r4.add(new com.facebook.wamsys.wce.EncryptedBackupsAttachment(r7.objectId_, r7.mimetype_, null, null, null, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0240, code lost:
    
        r16 = java.lang.Integer.valueOf(r8);
        r18 = java.lang.Boolean.valueOf(r13);
        r19 = X.LIS.A00.A01(r2, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0254, code lost:
    
        if (r4.isEmpty() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0256, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0257, code lost:
    
        r0 = new com.facebook.wamsys.wce.MessageBackupDirective(r31, r16, null, r18, r19, r4, r3, java.lang.Boolean.valueOf(r1), java.lang.Boolean.valueOf(r15), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026e, code lost:
    
        r7 = com.instagram.direct.armadilloexpress.transportpayload.Link.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0271, code lost:
    
        r3 = X.AbstractC166987dD.A1E();
        r4 = r2.content_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r9 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0277, code lost:
    
        if (r4 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0279, code lost:
    
        r4 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x027b, code lost:
    
        r4 = r4.A0M().media_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0281, code lost:
    
        if (r4 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0283, code lost:
    
        r4 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0285, code lost:
    
        X.C14360o3.A07(r4);
        r4 = X.LL6.A00(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x028c, code lost:
    
        if (r4 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x028e, code lost:
    
        r3.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0291, code lost:
    
        r18 = java.lang.Integer.valueOf(r8);
        r20 = java.lang.Boolean.valueOf(r17);
        r21 = X.LIS.A00.A01(r2, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02a5, code lost:
    
        if (r3.isEmpty() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a7, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a8, code lost:
    
        r0 = new com.facebook.wamsys.wce.MessageBackupDirective(r31, r18, null, r20, r21, r3, r7, java.lang.Boolean.valueOf(r1), java.lang.Boolean.valueOf(r15), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c1, code lost:
    
        if (r1 != r8) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c3, code lost:
    
        r1 = (com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload) r14.transportPayload_;
        X.C14360o3.A07(r1);
        r3 = r14.openEb_;
        r2 = r14.isE2EeAttributed_;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cf, code lost:
    
        if (r34 == 1) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02d1, code lost:
    
        if (r34 == r8) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d3, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d8, code lost:
    
        if ((r1.bitField0_ & 1) == 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02da, code lost:
    
        r1 = r1.messageOtid_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 2342161871149800121L) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02dc, code lost:
    
        if (r1 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02de, code lost:
    
        r0 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class;
        r0 = new com.facebook.wamsys.wce.MessageBackupDirective(r1, 4, null, java.lang.Boolean.valueOf(r4), null, null, null, java.lang.Boolean.valueOf(r3), java.lang.Boolean.valueOf(r2), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03a8, code lost:
    
        X.C0K8.A0C("ArmadilloExpressBackupGeneratorForProtoBufferTransport", "Delete message backup directive can't be created without a valid target message OTID");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0304, code lost:
    
        if (r1 != 3) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0306, code lost:
    
        r13 = X.LL6.A00;
        r12 = X.AbstractC43592JPx.A0a(r14);
        r7 = r14.openEb_;
        r2 = r14.isE2EeAttributed_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0314, code lost:
    
        if ((r12.bitField0_ & 1) == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0316, code lost:
    
        r1 = r12.targetMessageOtid_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0318, code lost:
    
        if (r1 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031a, code lost:
    
        r14 = r13.A04(r9, r12, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r9 = r27.userSession;
        X.C14360o3.A0B(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x031e, code lost:
    
        if (r14 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0320, code lost:
    
        r4 = r12.content_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0322, code lost:
    
        if (r4 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0324, code lost:
    
        r4 = com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0326, code lost:
    
        r9 = r4.A0L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0330, code lost:
    
        if (X.AbstractC43592JPx.A04(r9.mimetype_) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x033c, code lost:
    
        if (X.AbstractC43592JPx.A04(r4.A0L().objectId_) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x033e, code lost:
    
        r3 = com.facebook.wamsys.wce.EncryptedBackupsAttachment.$redex_init_class;
        r3 = r4.A0L();
        r17 = X.AbstractC166987dD.A1J(new com.facebook.wamsys.wce.EncryptedBackupsAttachment(r3.objectId_, r3.mimetype_, null, null, null, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x035d, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x035e, code lost:
    
        if (r34 == 1) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0360, code lost:
    
        if (r34 == r8) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0362, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0363, code lost:
    
        r5 = X.LIS.A00.A01(null, r34);
        r3 = X.AbstractC166987dD.A1E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0370, code lost:
    
        if (r9.seen_ == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0372, code lost:
    
        r3.add("UNREAD_RAVEN");
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0377, code lost:
    
        r0 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class;
        r0 = new com.facebook.wamsys.wce.MessageBackupDirective(r1, 3, r14, java.lang.Boolean.valueOf(r12), r5, r17, null, java.lang.Boolean.valueOf(r7), java.lang.Boolean.valueOf(r2), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0397, code lost:
    
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0399, code lost:
    
        if (r9.replayed_ == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x039b, code lost:
    
        r5 = X.AbstractC001800i.A0U(r5);
        r5.add("RAVEN_REPLAYED");
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r14 = X.LJ5.A00(r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03a5, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03af, code lost:
    
        r0 = new X.C45350K5j(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03b5, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03b6, code lost:
    
        X.C0K8.A0F("ArmadilloExpressBackupGeneratorForProtoBufferTransport", "Failed to parse protobuf to create backup directive", r2);
        r0 = new X.C45350K5j(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03db, code lost:
    
        return new X.C45350K5j(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x001b, code lost:
    
        if (r14 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r14 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        r1 = r14.transportPayloadCase_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r1 != 1) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        r2 = r14.A0L();
        X.C14360o3.A07(r2);
        r1 = r14.openEb_;
        r15 = r14.isE2EeAttributed_;
        r7 = r2.metadata_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r7 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        r7 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        X.C14360o3.A07(r7);
        r12 = r2.metadata_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r12 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        r12 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        X.C14360o3.A07(r12);
        r14 = r2.content_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r14 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        r14 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        X.C14360o3.A07(r14);
        r7 = r14.A0O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r7 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        r7.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        r7 = X.LL6.A01(r12);
        r17 = X.LL6.A03(r9, r2, r7, r34);
        r13 = r14.A0O().intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r13 == 3) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        r16 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r13 == r8) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        if (r13 == 4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        if (r13 == 6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        r3 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class;
        r0 = new com.facebook.wamsys.wce.MessageBackupDirective(r31, java.lang.Integer.valueOf(r8), null, java.lang.Boolean.valueOf(r17), X.LIS.A00.A01(r2, r34), null, r7, java.lang.Boolean.valueOf(r1), java.lang.Boolean.valueOf(r15), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        r4 = X.AbstractC166987dD.A1E();
        r3 = r2.metadata_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
    
        if (r3 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r34 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
    
        r3 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        X.C14360o3.A07(r3);
        r3 = X.LL6.A01(r3);
        r12 = X.LL6.A03(r9, r2, r3, r34);
        r9 = r2.content_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        if (r9 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        r9 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        if (r9.addMessageContentCase_ != 7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f3, code lost:
    
        r7 = (com.instagram.direct.armadilloexpress.transportpayload.Collection) r9.addMessageContent_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f7, code lost:
    
        r9 = r7.media_.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0101, code lost:
    
        if (r9.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0103, code lost:
    
        r7 = X.LL6.A00((com.instagram.direct.armadilloexpress.transportpayload.Media) X.AbstractC166997dE.A0l(r9), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010d, code lost:
    
        if (r7 == null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010f, code lost:
    
        r4.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0116, code lost:
    
        r7 = com.facebook.wamsys.wce.MessageBackupDirective.$redex_init_class;
        r0 = new com.facebook.wamsys.wce.MessageBackupDirective(r31, java.lang.Integer.valueOf(r8), null, java.lang.Boolean.valueOf(r12), X.LIS.A00.A01(r2, r34), r4, r3, java.lang.Boolean.valueOf(r1), java.lang.Boolean.valueOf(r15), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
    
        r7 = com.instagram.direct.armadilloexpress.transportpayload.Collection.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        r1 = java.nio.charset.StandardCharsets.UTF_8;
        X.C14360o3.A08(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013e, code lost:
    
        r8 = r14.A0L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0144, code lost:
    
        if (r8.mediaCase_ != 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0146, code lost:
    
        r8 = r8.A0M().A0L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0150, code lost:
    
        if (r8 == X.EnumC46313Kej.RAVEN_VIEW_MODEL_ONCE) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0154, code lost:
    
        if (r8 != X.EnumC46313Kej.RAVEN_VIEW_MODEL_REPLAYABLE) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0156, code lost:
    
        r16 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0158, code lost:
    
        r7 = r2.metadata_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015a, code lost:
    
        if (r7 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015c, code lost:
    
        r7 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (X.AbstractC43592JPx.A1a("{\"", 1, new java.lang.String(r37, r1)) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015e, code lost:
    
        X.C14360o3.A07(r7);
        r7 = X.LL6.A01(r7);
        r14 = X.LL6.A03(r9, r2, r7, r34);
        r11 = X.AbstractC166987dD.A1E();
        r8 = r2.content_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016f, code lost:
    
        if (r8 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0171, code lost:
    
        r8 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0173, code lost:
    
        r8 = r8.A0L();
        X.C14360o3.A07(r8);
        r8 = X.LL6.A00(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017e, code lost:
    
        if (r8 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0180, code lost:
    
        r11.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0183, code lost:
    
        r8 = X.LIS.A00.A01(r2, r34);
        r0 = r2.content_;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018b, code lost:
    
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018d, code lost:
    
        r0 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018f, code lost:
    
        r20 = null;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019b, code lost:
    
        if (X.AbstractC167007dF.A1P(r0.A0L().mediaCase_, 4) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019d, code lost:
    
        r0 = X.AnonymousClass189.A00(r9).A02(r9.userId);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a7, code lost:
    
        if (r0 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a9, code lost:
    
        r0 = r0.BTC();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ad, code lost:
    
        if (r0 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01af, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b5, code lost:
    
        if (r0.longValue() == r32) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b7, code lost:
    
        r8 = X.AbstractC001800i.A0U(r8);
        r8.add("UNREAD_RAVEN");
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c0, code lost:
    
        r16 = java.lang.Integer.valueOf(r16);
        r18 = java.lang.Boolean.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ce, code lost:
    
        if (r11.isEmpty() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r3 == false) goto L18;
     */
    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.backupupdategenerator.Postmailbox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.wamsys.wce.MessageBackupDirective IGBackupUpdateGeneratorPluginImpl_MEMBackupUpdateGeneratorCreateMessageBackupDirective(com.facebook.msys.mci.PrivacyContext r28, long r29, java.lang.String r31, long r32, int r34, java.lang.Number r35, java.lang.Object r36, byte[] r37) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.realtime.armadilloexpress.plugins.backupupdategenerator.IGBackupUpdateGeneratorPluginImplPostmailbox.IGBackupUpdateGeneratorPluginImpl_MEMBackupUpdateGeneratorCreateMessageBackupDirective(com.facebook.msys.mci.PrivacyContext, long, java.lang.String, long, int, java.lang.Number, java.lang.Object, byte[]):com.facebook.wamsys.wce.MessageBackupDirective");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGBackupUpdateGeneratorPluginImplPostmailbox(AccountSession accountSession, UserSession userSession) {
        super(accountSession, userSession);
        AbstractC167017dG.A1P(accountSession, userSession);
        this.userSession = userSession;
    }
}
