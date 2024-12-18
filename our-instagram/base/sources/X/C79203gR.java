package X;

import android.graphics.Rect;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3gR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79203gR extends C2X7 implements InterfaceC79103gH {
    public static final C79203gR A00 = new Object();

    public static C2WS A00(C79073gE c79073gE) {
        C2WS c2ws = ((C79223gT) c79073gE.A02).A02;
        if (c2ws == null) {
            return c79073gE.A00.A06.A07;
        }
        return c2ws;
    }

    public static HashMap A01(C79803hV c79803hV) {
        HashMap hashMap = new HashMap();
        hashMap.put("renderUnitId", Long.valueOf(c79803hV.A05));
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c79803hV.A08);
        hashMap.put("bounds", c79803hV.A06);
        hashMap.put("key", c79803hV.A09);
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fc, code lost:
    
        if (r12.equals(r7) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r7.equals(r12) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f8 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e8 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d8 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021a A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ca A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023c A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0248 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0254 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0260 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027b A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:185:0x000e, B:3:0x0013, B:7:0x001f, B:10:0x0027, B:12:0x0035, B:15:0x0047, B:17:0x0055, B:18:0x005e, B:20:0x0066, B:22:0x006e, B:24:0x0080, B:28:0x008c, B:30:0x0091, B:32:0x02cd, B:34:0x0095, B:36:0x00a9, B:43:0x00e3, B:45:0x00eb, B:47:0x00f3, B:48:0x00f5, B:50:0x00fd, B:51:0x0109, B:53:0x010f, B:55:0x0117, B:56:0x0120, B:58:0x02ca, B:62:0x0129, B:67:0x022a, B:69:0x0232, B:71:0x023c, B:72:0x0242, B:74:0x0248, B:75:0x024e, B:77:0x0254, B:78:0x025a, B:80:0x0260, B:81:0x0266, B:83:0x026e, B:85:0x027b, B:87:0x028e, B:89:0x0296, B:90:0x0299, B:92:0x02a5, B:94:0x02ad, B:95:0x02b0, B:96:0x01b1, B:98:0x01bd, B:100:0x01c5, B:103:0x01e1, B:110:0x01fe, B:112:0x0204, B:114:0x020a, B:115:0x01f8, B:117:0x01e8, B:118:0x01d8, B:119:0x0214, B:121:0x021a, B:123:0x0220, B:125:0x012e, B:127:0x014c, B:129:0x0150, B:131:0x015e, B:132:0x0160, B:134:0x0168, B:136:0x0174, B:137:0x0176, B:139:0x0181, B:141:0x01a3, B:144:0x00b4, B:146:0x00c7, B:153:0x02d1, B:154:0x02d9, B:156:0x02df, B:158:0x02f5, B:159:0x02f7, B:166:0x02fb, B:162:0x0301, B:171:0x030b), top: B:184:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.graphics.Rect r33, X.C79073gE r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79203gR.A02(android.graphics.Rect, X.3gE, boolean):void");
    }

    public static void A03(C79073gE c79073gE) {
        int i;
        C79223gT c79223gT = (C79223gT) c79073gE.A02;
        C79243gV c79243gV = c79073gE.A00.A06.A02;
        if (c79243gV != null) {
            i = c79243gV.A00;
        } else {
            i = -1;
        }
        boolean isTracing = C1LN.A01.isTracing();
        if (isTracing) {
            C1LN.A01("VisibilityExtension.clearIncrementalItems");
        }
        ArrayList arrayList = new ArrayList();
        Map map = c79223gT.A06;
        for (Map.Entry entry : map.entrySet()) {
            C79803hV c79803hV = (C79803hV) entry.getValue();
            if (c79803hV.A03) {
                c79803hV.A03 = false;
            } else {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            C79803hV c79803hV2 = (C79803hV) map.get(obj);
            if (c79803hV2 != null) {
                C2VA c2va = c79803hV2.A02;
                C2VA c2va2 = c79803hV2.A07;
                A04(c79803hV2, i);
                if ((c79803hV2.A00 & 32) != 0) {
                    c79803hV2.A00 &= -33;
                    if (c2va != null) {
                        c2va.call(AbstractC79823hX.A03);
                    }
                }
                if (c2va2 != null) {
                    C2X9 c2x9 = AbstractC79823hX.A04;
                    c2x9.A00 = 0.0f;
                    c2va2.call(c2x9);
                }
                c79803hV2.A04 = false;
            }
            map.remove(obj);
        }
        if (isTracing) {
            C1LN.A00();
        }
        c79223gT.A05.setEmpty();
    }

    public static void A04(C79803hV c79803hV, int i) {
        if (c79803hV.A01 != null) {
            Integer A01 = AbstractC50692Uq.A01("RenderCore.RenderUnit.OnInvisible");
            if (A01 != null) {
                AbstractC50692Uq.A05("RenderCore.RenderUnit.OnInvisible", String.valueOf(i), A01(c79803hV), A01.intValue());
            }
            C2VA c2va = c79803hV.A01;
            C14360o3.A0B(c2va, 0);
            c2va.call(AbstractC79823hX.A02);
            if (A01 != null) {
                AbstractC50692Uq.A02(A01.intValue());
            }
        }
    }

    public static boolean A05(C79073gE c79073gE) {
        C50882Vk c50882Vk = ((C79223gT) c79073gE.A02).A01;
        if ((c50882Vk != null && !c50882Vk.A06) || A00(c79073gE).hasTransientState()) {
            return false;
        }
        return true;
    }

    @Override // X.C2X7
    public final /* bridge */ /* synthetic */ Object A0A() {
        return new C79223gT();
    }

    @Override // X.C2X7
    public final /* bridge */ /* synthetic */ void A0B(Rect rect, C79073gE c79073gE, Object obj) {
        C50882Vk c50882Vk = (C50882Vk) obj;
        c50882Vk.getClass();
        boolean isTracing = C1LN.A01.isTracing();
        if (isTracing) {
            C1LN.A01("VisibilityExtension.beforeMount");
        }
        C79223gT c79223gT = (C79223gT) c79073gE.A02;
        c79223gT.A03 = c50882Vk.A0S;
        c79223gT.A04 = c50882Vk.A0Z;
        c79223gT.A05.setEmpty();
        c79223gT.A00 = rect;
        c79223gT.A01 = c50882Vk;
        if (isTracing) {
            C1LN.A00();
        }
    }

    @Override // X.C2X7
    public final void A0C(C79073gE c79073gE) {
        boolean isTracing = C1LN.A01.isTracing();
        if (isTracing) {
            C1LN.A01("VisibilityExtension.afterMount");
        }
        if (A05(c79073gE)) {
            A02(((C79223gT) c79073gE.A02).A00, c79073gE, true);
        }
        if (isTracing) {
            C1LN.A00();
        }
    }

    @Override // X.C2X7
    public final void A0E(C79073gE c79073gE) {
        C79223gT c79223gT = (C79223gT) c79073gE.A02;
        c79223gT.A05.setEmpty();
        c79223gT.A01 = null;
    }

    @Override // X.InterfaceC79103gH
    public final void E1F(Rect rect, C79073gE c79073gE) {
        boolean A05 = A05(c79073gE);
        boolean isTracing = C1LN.A01.isTracing();
        if (isTracing) {
            C1LN.A01("VisibilityExtension.onVisibleBoundsChanged");
        }
        if (A05) {
            A02(rect, c79073gE, false);
        }
        if (isTracing) {
            C1LN.A00();
        }
    }

    @Override // X.C2X7
    public final void A0D(C79073gE c79073gE) {
        A03(c79073gE);
    }
}
