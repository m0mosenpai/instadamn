package com.facebook.rsys.rooms.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class RoomMetadataModel {
    public static C2N9 CONVERTER = YAM.A00(45);
    public static long sMcfTypeId;
    public final boolean canViewerModerateRoom;
    public final boolean canViewerReportToAdmins;
    public final boolean canViewerReportToFb;
    public final String groupReportableId;
    public final int linkSurface;
    public final String roomBroadcastId;
    public final String roomName;
    public final String roomSubtitleName;
    public final String workoomsCollaborationSpaceLink;

    public static native RoomMetadataModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomMetadataModel)) {
                return false;
            }
            RoomMetadataModel roomMetadataModel = (RoomMetadataModel) obj;
            String str = this.roomName;
            String str2 = roomMetadataModel.roomName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.roomSubtitleName;
            String str4 = roomMetadataModel.roomSubtitleName;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.linkSurface != roomMetadataModel.linkSurface || this.canViewerReportToFb != roomMetadataModel.canViewerReportToFb || this.canViewerReportToAdmins != roomMetadataModel.canViewerReportToAdmins) {
                return false;
            }
            String str5 = this.groupReportableId;
            String str6 = roomMetadataModel.groupReportableId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.roomBroadcastId;
            String str8 = roomMetadataModel.roomBroadcastId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.workoomsCollaborationSpaceLink;
            String str10 = roomMetadataModel.workoomsCollaborationSpaceLink;
            if (str9 != null) {
                if (!str9.equals(str10)) {
                    return false;
                }
            } else if (str10 != null) {
                return false;
            }
            if (this.canViewerModerateRoom != roomMetadataModel.canViewerModerateRoom) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((JQ0.A01(AbstractC167017dG.A0O(this.roomName)) + AbstractC167017dG.A0O(this.roomSubtitleName)) * 31) + this.linkSurface) * 31) + (this.canViewerReportToFb ? 1 : 0)) * 31) + (this.canViewerReportToAdmins ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.groupReportableId)) * 31) + AbstractC167017dG.A0O(this.roomBroadcastId)) * 31) + AbstractC25227BEk.A07(this.workoomsCollaborationSpaceLink)) * 31) + (this.canViewerModerateRoom ? 1 : 0);
    }

    public RoomMetadataModel(String str, String str2, int i, boolean z, boolean z2, String str3, String str4, String str5, boolean z3) {
        this.roomName = str;
        this.roomSubtitleName = str2;
        this.linkSurface = i;
        this.canViewerReportToFb = z;
        this.canViewerReportToAdmins = z2;
        this.groupReportableId = str3;
        this.roomBroadcastId = str4;
        this.workoomsCollaborationSpaceLink = str5;
        this.canViewerModerateRoom = z3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RoomMetadataModel{roomName=");
        A1C.append(this.roomName);
        A1C.append(",roomSubtitleName=");
        A1C.append(this.roomSubtitleName);
        A1C.append(",linkSurface=");
        A1C.append(this.linkSurface);
        A1C.append(",canViewerReportToFb=");
        A1C.append(this.canViewerReportToFb);
        A1C.append(",canViewerReportToAdmins=");
        A1C.append(this.canViewerReportToAdmins);
        A1C.append(",groupReportableId=");
        A1C.append(this.groupReportableId);
        A1C.append(",roomBroadcastId=");
        A1C.append(this.roomBroadcastId);
        A1C.append(",workoomsCollaborationSpaceLink=");
        A1C.append(this.workoomsCollaborationSpaceLink);
        A1C.append(",canViewerModerateRoom=");
        return AbstractC50523MSb.A0X(A1C, this.canViewerModerateRoom);
    }
}
