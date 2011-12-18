package fr.crafter.tickleman.realadmintools;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import fr.crafter.tickleman.realplugin.RealPlugin;

//############################################################################ RealAdminToolsPlugin
public class RealAdminToolsPlugin extends RealPlugin
{

	//-------------------------------------------------------------------------- RealTeleporterPlugin
	public RealAdminToolsPlugin()
	{
		super();
	}

	//------------------------------------------------------------------------------- onPlayerCommand
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		return RealAdminToolsCommands.onCommand(this, sender, cmd, commandLabel, args);
	}

	//------------------------------------------------------------------------------------- onDisable
	@Override
	public void onDisable()
	{
		super.onDisable();
	}

	//-------------------------------------------------------------------------------------- onEnable
	@Override
	public void onEnable()
	{
		super.onEnable();
	}

}